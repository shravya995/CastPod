package com.example.castpod1;


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Sports_michigan_page extends AppCompatActivity {
    ListView lstrss;
    SearchView searchview;

    ArrayList<String> titles;
    ArrayList<String> links;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_michigan_page);
        lstrss=(ListView) findViewById(R.id.lstrss);
        searchview=(SearchView)findViewById(R.id.search_view) ;

        titles=new ArrayList<String>();
        links=new ArrayList<String>();

        lstrss.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri uri=Uri.parse(links.get(position));
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
        new ProcessInbackground().execute();
    }
    public InputStream getinputStream(URL url)
    {
        try
        {
            return url.openConnection().getInputStream();
        }
        catch(IOException e)
        {
            return null;
        }
    }
    public class ProcessInbackground extends AsyncTask<Integer,Void,String>
    {
        ProgressDialog progressDialog=new ProgressDialog(Sports_michigan_page.this);
        Exception exception=null;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.setMessage("busy Loading RSS FEED....please wait!! ");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(Integer... integers) {
            try
            {
                URL url=new URL("https://wkar.drupal.publicbroadcasting.net/feeds/858/rss.xml");
                XmlPullParserFactory factory=XmlPullParserFactory.newInstance();

                factory.setNamespaceAware(false);
                XmlPullParser xpp=factory.newPullParser();
                xpp.setInput(getinputStream(url),"UTF_8");
                boolean insideitem=false;
                int eventtype=xpp.getEventType();
                while(eventtype !=XmlPullParser.END_DOCUMENT)
                {
                    if(eventtype == XmlPullParser.START_TAG)
                    {
                        if(xpp.getName().equalsIgnoreCase("item"))
                        {
                            insideitem=true;
                        }
                        else if(xpp.getName().equalsIgnoreCase("title"))
                        {
                            if(insideitem)
                            {
                                titles.add(xpp.nextText());
                            }
                        }
                        else if(xpp.getName().equalsIgnoreCase("link"))
                        {
                            if(insideitem)
                            {
                                links.add(xpp.nextText());
                            }
                        }
                    }
                    else if(eventtype == XmlPullParser.END_TAG && xpp.getName().equalsIgnoreCase("item"))
                    {
                        insideitem=false;
                    }
                    eventtype=xpp.next();
                }
            }
            catch(MalformedURLException e)
            {
                exception=e;
            }
            catch(XmlPullParserException e)
            {
                exception=e;
            }
            catch (IOException e)
            {
                exception=e;
            }
            return null;

        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            final ArrayAdapter<String > adapter =new ArrayAdapter<String>(Sports_michigan_page.this,android.R.layout.simple_list_item_1,titles);
            lstrss.setAdapter(adapter);
            searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);



                    return false;
                }
            });
            progressDialog.dismiss();
        }
    }
}

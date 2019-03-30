package com.santanu.customarrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TodayMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_match);

        Intent i = getIntent();

        String todayDate = i.getExtras().getString("dd-MM-yyyy");

//        String csk = "Chennai Super Kings";
        String dc = "Delhi Capitals";
        String kxip = "Kings XI Punjab";
        String kkr = "Kolkata Knight Riders";
        String mi = "Mumbai Indians";
//        String rr = "Rajasthan Royals";
//        String rcb = "Royal Challengers Bangalore";
//        String srh = "Sunrisers Hyderabad";

//        String cskStadium = "M.A. Chidambaram Stadium, Chennai";
        String dcStadium = "Feroz Shah Kotla, Delhi";
        String kxipStadium = "Punjab Cricket Association Stadium, Mohali, Chandigarh";
//        String kkrStadium = "Eden Gardens, Kolkata";
//        String miStadium = "Wankhede Stadium, Mumbai";
//        String rrStadium = "Sawai Mansingh Stadium, Jaipur";
//        String rcbStadium = "M.Chinnaswamy Stadium, Bangalore";
//        String srhStadium = "Rajiv Gandhi International Stadium, Hyderabad";

//        ArrayList<TodaysMatchDetails> todaysMatchDetails = new ArrayList<TodaysMatchDetails>();
//
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,rcb,"8.00 PM | "+rcbStadium,R.drawable.csk,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,srh,"4.00 PM | "+kkrStadium,R.drawable.kkr,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,dc,"8.00 PM | "+dcStadium,R.drawable.mi,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,kxip, "8.00 PM | "+kxipStadium,R.drawable.rr,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,csk, "8.00 PM | "+dcStadium,R.drawable.dc,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,kxip, "8.00 PM | "+kkrStadium,R.drawable.kkr,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,mi, "8.00 PM | "+rcbStadium,R.drawable.rcb,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,rr, "8.00 PM | "+srhStadium,R.drawable.srh,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,mi, "4.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,kkr, "8.00 PM | "+dcStadium,R.drawable.dc,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,rcb, "4.00 PM | "+srhStadium,R.drawable.srh,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,rr, "8.00 PM | "+cskStadium,R.drawable.csk,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,dc, "8.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,rcb, "8.00 PM | "+rrStadium,R.drawable.rr,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,csk, "8.00 PM | "+miStadium,R.drawable.mi,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,srh, "8.00 PM | "+dcStadium,R.drawable.dc,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,kkr, "8.00 PM | "+rcbStadium,R.drawable.rcb,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,kxip, "4.00 PM | "+cskStadium,R.drawable.csk,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,mi, "8.00 PM | "+srhStadium,R.drawable.srh,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,dc, "4.00 PM | "+rcbStadium,R.drawable.rcb,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,kkr, "8.00 PM | "+rrStadium,R.drawable.rr,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,srh, "8.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,kkr, "8.00 PM | "+cskStadium,R.drawable.csk,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,kxip, "8.00 PM | "+miStadium,R.drawable.mi,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,csk, "8.00 PM | "+rrStadium,R.drawable.rr,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,dc, "8.00 PM | "+kkrStadium,R.drawable.kkr,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,rr, "4.00 PM | "+miStadium,R.drawable.mi,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,rcb, "8.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,csk, "4.00 PM | "+kkrStadium,R.drawable.kkr,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,dc, "4.00 PM | "+srhStadium,R.drawable.srh,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,rcb, "8.00 PM | "+miStadium,R.drawable.mi,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,rr, "8.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,csk, "8.00 PM | "+srhStadium,R.drawable.srh,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,mi, "8.00 PM | "+dcStadium,R.drawable.dc,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,rcb, "8.00 PM"+ kkrStadium,R.drawable.kkr,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,mi, "4.00 PM"+rrStadium,R.drawable.rr,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,kxip, "4.00 PM"+dcStadium,R.drawable.dc,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,kkr, "4.00 PM"+srhStadium,R.drawable.srh,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,csk, "4.00 PM"+rcbStadium,R.drawable.rcb,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,dc, "8.00 PM"+rrStadium,R.drawable.rr,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,srh, "8.00 PM"+cskStadium,R.drawable.csk,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,kxip, "8.00 PM"+rcbStadium,R.drawable.rcb,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,rr, "8.00 PM"+kkrStadium,R.drawable.kkr,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,mi, "8.00 PM"+cskStadium,R.drawable.csk,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(rr,srh, "8.00 PM"+rrStadium,R.drawable.rr,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,rcb, "8.00 PM"+dcStadium,R.drawable.dc,R.drawable.rcb));
//        todaysMatchDetails.add(new TodaysMatchDetails(kkr,mi, "4.00 PM"+kkrStadium,R.drawable.kkr,R.drawable.mi));
//        todaysMatchDetails.add(new TodaysMatchDetails(srh,kxip, "8.00 PM"+srhStadium,R.drawable.srh,R.drawable.kxip));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,rr, "8.00 PM"+rcbStadium,R.drawable.rcb,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(csk,dc, "8.00 PM"+cskStadium,R.drawable.csk,R.drawable.dc));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,srh, "8.00 PM"+miStadium,R.drawable.mi,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,kkr, "8.00PM"+kxipStadium,R.drawable.kxip,R.drawable.kkr));
//        todaysMatchDetails.add(new TodaysMatchDetails(dc,rr, "8.00 PM"+dcStadium,R.drawable.dc,R.drawable.rr));
//        todaysMatchDetails.add(new TodaysMatchDetails(rcb,srh, "8.00 PM"+rcbStadium,R.drawable.rcb,R.drawable.srh));
//        todaysMatchDetails.add(new TodaysMatchDetails(kxip,csk, "4.00 PM"+kxipStadium,R.drawable.kxip,R.drawable.csk));
//        todaysMatchDetails.add(new TodaysMatchDetails(mi,kkr, "8.00 PM"+miStadium,R.drawable.mi,R.drawable.kkr));
//
//
//        TodaysMatchDetailsAdapter todaysMatchDetailsAdapter = new TodaysMatchDetailsAdapter(this, todaysMatchDetails);
//
//        ListView listView = findViewById(R.id.today_match_listview);
//        listView.setAdapter(todaysMatchDetailsAdapter);

        if(todayDate.trim() == "30-03-2019"){

            ArrayList<TodaysMatchDetails> todaysMatchDetails = new ArrayList<TodaysMatchDetails>();

            todaysMatchDetails.add(new TodaysMatchDetails(kxip,mi, "4.00 PM | "+kxipStadium,R.drawable.kxip,R.drawable.mi));
            todaysMatchDetails.add(new TodaysMatchDetails(dc,kkr, "8.00 PM | "+dcStadium,R.drawable.dc,R.drawable.kkr));




            TodaysMatchDetailsAdapter todaysMatchDetailsAdapter = new TodaysMatchDetailsAdapter(this, todaysMatchDetails);

            ListView listView = findViewById(R.id.today_match_listview);
            listView.setAdapter(todaysMatchDetailsAdapter);

        }

        else {


            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }


    }
}

package com.santanu.customarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String csk = "Chennai Super Kings";
        String dc = "Delhi Capitals";
        String kxip = "Kings XI Punjab";
        String kkr = "Kolkata Knight Riders";
        String mi = "Mumbai Indians";
        String rr = "Rajasthan Royals";
        String rcb = "Royal Challengers Bangalore";
        String srh = "Sunrisers Hyderabad";

        String cskStadium = "M.A. Chidambaram Stadium, Chennai";
        String dcStadium = "Feroz Shah Kotla, Delhi";
        String kxipStadium = "Punjab Cricket Association Stadium, Mohali, Chandigarh";
        String kkrStadium = "Eden Gardens, Kolkata";
        String miStadium = "Wankhede Stadium, Mumbai";
        String rrStadium = "Sawai Mansingh Stadium, Jaipur";
        String rcbStadium = "M.Chinnaswamy Stadium, Bangalore";
        String srhStadium = "Rajiv Gandhi International Stadium, Hyderabad";


        ArrayList<MatchDetails> matchDetails = new ArrayList<MatchDetails>();

        matchDetails.add(new MatchDetails("Chennai Super Kings","Royal Challengers Bangalore", "23rd March  8.00 PM",rcbStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails("Kolkata Knight Riders","Sunrises Hyderabad", "24th March  4.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails("Mumbai Indians","Delhi Capitals", "24th March  8.00 PM",dcStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails("Rajasthan Royals","Kings XI Punjab", "25th March  8.00 PM",kxipStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails("Delhi Capitals","Chennai Super Kings", "26th March  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails("Kolkata Knight Riders","Kings XI Punjab", "27th March  8.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails("Royal Challengers Bangalore","Mumbai Indians", "28th March  8.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails("Sunrises Hyderabad","Rajasthan Royals", "29th March  8.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails("Kings XI Punjab","Mumbai Indians", "30th March  4.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails("Delhi Capitals","Kolkata Knight Riders", "30th March  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails("Sunrisers Hyderabad","Royal Challengers Bangalore", "31st March  4.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails("Chennai Super Kings","Rajasthan Royals", "31st March  8.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails("Kings XI Punjab","Delhi Capitals", "1st April  8.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails("Rajasthan Royals","Royal Challengers Bangalore", "2nd April  8.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails("Mumbai Indians","Chennai Super Kings", "3rd April  8.00 PM",miStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails("Delhi Capitals","Sunrises Hyderabad", "4th April  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails("Royal Challengers Bangalore","Kolkata Knight Riders", "5th April  8.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(csk,kxip, "6th April  4.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails(srh,mi, "6th April  8.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails(rcb,dc, "7th April  4.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(rr,kkr, "7th April  8.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails(kxip,srh, "8th April  8.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails(csk,kkr, "9th April  8.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails(mi,kxip, "10th April  8.00 PM",miStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails(rr,csk, "11th April  8.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails(kkr,dc, "12th April  8.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails(mi,rr, "13th April  4.00 PM",miStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails(kxip,rcb, "13th April  8.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails(kkr,csk, "14th April  4.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails(srh,dc, "14th April  8.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails(mi,rcb, "15th April  8.00 PM",miStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails(kxip,rr, "16th April  8.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails(srh,csk, "17th April  8.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails(dc,mi, "18th April  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails(kkr,rcb, "19th April  8.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails(rr,mi, "20th April  4.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails(dc,kxip, "20th April  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails(srh,kkr, "21st April  4.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails(rcb,csk, "21st April  4.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(rr,dc, "21st April  8.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails(csk,srh, "22nd April  8.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails(rcb,kxip, "23rd April  8.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(kkr,rr, "24th April  8.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails(csk,mi, "25th April  8.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails(rr,srh, "26th April  8.00 PM",rrStadium,R.drawable.rr));
        matchDetails.add(new MatchDetails(dc,rcb, "27th April  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails(kkr,mi, "28th April  4.00 PM",kkrStadium,R.drawable.kkr));
        matchDetails.add(new MatchDetails(srh,kxip, "28th April  8.00 PM",srhStadium,R.drawable.srh));
        matchDetails.add(new MatchDetails(rcb,rr, "29th April  8.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(csk,dc, "30th April  8.00 PM",cskStadium,R.drawable.csk));
        matchDetails.add(new MatchDetails(mi,srh, "1st May  8.00 PM",miStadium,R.drawable.mi));
        matchDetails.add(new MatchDetails(kxip,kkr, "2nd May  8.00PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails(dc,rr, "3rd May  8.00 PM",dcStadium,R.drawable.dc));
        matchDetails.add(new MatchDetails(rcb,srh, "4th May  8.00 PM",rcbStadium,R.drawable.rcb));
        matchDetails.add(new MatchDetails(kxip,csk, "5th May  4.00 PM",kxipStadium,R.drawable.kxip));
        matchDetails.add(new MatchDetails(mi,kkr, "5th May  8.00 PM",miStadium,R.drawable.mi));
//        matchDetails.add(new MatchDetails("","", "","",""));
//        matchDetails.add(new MatchDetails("","", "","",""));




        MatchDetailsAdapter matchDetailsAdapter = new MatchDetailsAdapter(this, matchDetails);

        ListView listView = findViewById(R.id.listview_match);
        listView.setAdapter(matchDetailsAdapter);

    }
}

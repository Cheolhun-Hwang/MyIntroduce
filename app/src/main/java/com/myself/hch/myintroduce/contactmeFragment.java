package com.myself.hch.myintroduce;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.pm.ActivityInfoCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class contactmeFragment extends Fragment {
    View v;

    Button sendCall;
    Button gotoNaverBlog;
    Button gotoGithub;
    Button gotoTailing;
    Button showMap;

    public contactmeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_contactme, container, false);

        sendCall = (Button)v.findViewById(R.id.sendCall);
        gotoNaverBlog = (Button)v.findViewById(R.id.gotoNaverBlog);
        gotoGithub = (Button)v.findViewById(R.id.gotoGithub);
        gotoTailing = (Button)v.findViewById(R.id.gotoTaling);
        showMap = (Button)v.findViewById(R.id.showMap);

        sendCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-4826-0178"));
                startActivity(intent);
            }
        });

        gotoNaverBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/qewqsa"));
                startActivity(intent);
            }
        });

        gotoGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/chulhun-hwang"));
                startActivity(intent);
            }
        });

        gotoTailing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://taling.me/Talent/Detail/1189"));
                startActivity(intent);
            }
        });

        showMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), googleMapActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}

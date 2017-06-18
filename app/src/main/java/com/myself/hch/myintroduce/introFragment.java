package com.myself.hch.myintroduce;


import android.os.Bundle;
import android.app.Fragment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class introFragment extends Fragment {
    View v;

    RadioButton opt1_doll;
    RadioButton opt2_movie;
    RadioButton opt3_game;
    RadioButton opt4_blog;
    RadioGroup rg;
    Button RadioPopbtn;

    public introFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onActivityCreated (Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        opt1_doll = (RadioButton) v.findViewById(R.id.getDoll);
        opt2_movie = (RadioButton) v.findViewById(R.id.seemovie);
        opt3_game = (RadioButton) v.findViewById(R.id.playGame);
        opt4_blog = (RadioButton) v.findViewById(R.id.getBlog);

        rg = (RadioGroup) v.findViewById(R.id.radioGroup_popup);

        opt1_doll.setChecked(true);

        RadioPopbtn = (Button) v.findViewById(R.id.radioPopbutton);

        RadioPopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opt1_doll.isChecked()){
                    Toast.makeText(getActivity(), "저는 최근 인형뽑기가 재밌더라고요. 돈이 ...문제지만....", Toast.LENGTH_LONG).show();
                }else if(opt2_movie.isChecked()){
                    Toast.makeText(getActivity(), "판타지, 액션을 좋아합니다. 로맨스는 별로...", Toast.LENGTH_LONG).show();
                }else if(opt3_game.isChecked()){
                    Toast.makeText(getActivity(), "RPG, AOS 장르를 좋아합니다. FPS는 어지럽더라고요..", Toast.LENGTH_LONG).show();
                }else if(opt4_blog.isChecked()){
                    Toast.makeText(getActivity(), "최근에는 바빠서 관리하지 못했지만, 예전에는 열심히 관리했습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_intro, container, false);

        return v;
    }

}

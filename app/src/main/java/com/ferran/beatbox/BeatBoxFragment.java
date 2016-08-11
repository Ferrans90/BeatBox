package com.ferran.beatbox;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeatBoxFragment extends Fragment {
    public static BeatBoxFragment newInstance() {

        Bundle args = new Bundle();

        BeatBoxFragment fragment = new BeatBoxFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public BeatBoxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beat_box, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.fragment_beat_box_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        recyclerView.setAdapter(new SoundAdapter());
        return v;
    }

    private class SoundHolder extends RecyclerView.ViewHolder{
        private Button mButton;

        public SoundHolder(LayoutInflater inflater,ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_sound,container,false));

            mButton=(Button)itemView.findViewById(R.id.list_item_sound_button);
        }
    }

    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{
        @Override
        public int getItemCount() {
            return 0;
        }

        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {

        }

        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(getActivity());
            return new SoundHolder(inflater,parent);
        }
    }

}

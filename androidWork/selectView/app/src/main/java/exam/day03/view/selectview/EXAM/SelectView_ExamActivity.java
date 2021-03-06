package exam.day03.view.selectview.EXAM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import exam.day03.view.selectview.R;

import exam.day03.view.selectview.view.adapter.ActorItem2;

public class SelectView_ExamActivity extends Activity {
    ArrayList<ActorItem2> actorlist = new ArrayList<ActorItem2>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_exam);
        ActorItem2 actorItem;

        actorItem = new ActorItem2(R.drawable.ansoccer,"안정환","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.chasoccer,"차범근","2020/04/06","아들~~");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.jjangkim,"김어준","2020/04/06","찐");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.kbr,"김범룡","2020/04/06","진짜가수");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.kimdong,"이민호","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.leemin,"이민호","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.parksoccer,"박지성","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.ansoccer,"안정환","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.chasoccer,"차범근","2020/04/06","아들~~");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.jjangkim,"김어준","2020/04/06","찐");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.kbr,"김범룡","2020/04/06","진짜가수");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.kimdong,"이민호","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.leemin,"이민호","2020/04/06","멋져");
        actorlist.add(actorItem);
        actorItem = new ActorItem2(R.drawable.parksoccer,"박지성","2020/04/06","멋져");
        actorlist.add(actorItem);
        ListView list = findViewById(R.id.exam_listView);
        ExamAdapter adapter =
                new ExamAdapter(this,R.layout.select_exam_row,actorlist);

        list.setAdapter(adapter);


      }
}

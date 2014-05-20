package com.topnews;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.topnews.adapter.ImagePagerAdapter;
import com.topnews.base.BaseActivity;
import com.topnews.view.ImageViewTouchViewPager;

/*
 * ͼƬչʾ
 */
public class ImageShowActivity extends BaseActivity {
	/** ͼƬչʾ */
	private ImageViewTouchViewPager image_pager;
	private TextView page_number;
	/** ͼƬ���ذ�ť */
	private ImageView download;
	/** ͼƬ�б� */
	private ArrayList<String> imgsUrl;
	/** PagerAdapter */
	private ImagePagerAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details_imageshow);
		initView();
		initData();
		initViewPager();
	}

	private void initData() {
		imgsUrl = getIntent().getStringArrayListExtra("infos");
	}

	private void initView() {
		image_pager = (ImageViewTouchViewPager) findViewById(R.id.image_pager);
		page_number = (TextView) findViewById(R.id.page_number);
		download = (ImageView) findViewById(R.id.download);
	}

	private void initViewPager() {
		if (imgsUrl != null && imgsUrl.size() != 0) {
			mAdapter = new ImagePagerAdapter(getApplicationContext(), imgsUrl);
			image_pager.setAdapter(mAdapter);
		}
	}
}

package elf.com.bagain.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import elf.com.bagain.fragment.DonghuaFragment;

/**
 * FragmentPager适配器
 * 
 * @author wwj_748
 * @2014/8/9
 */
public class KejiTabAdapter extends FragmentPagerAdapter {
	// 内容标题
	public static final String[] DONG_HUA_TITLE = new String[] { "动态", "纪录片",
		"科普人文", "野生技术", "公开课" , "军事", "数码"};
	
	public KejiTabAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}


	// 获取项
	@Override
	public Fragment getItem(int position) {
		System.out.println("Fragment position:" + position);
		
		switch (position) {
		case 0:
			return DonghuaFragment.newInstance(36);
		case 1:
			return DonghuaFragment.newInstance(37);
		case 2:
			return DonghuaFragment.newInstance(124);
		case 3:
			return DonghuaFragment.newInstance(122);
		case 4:
			return DonghuaFragment.newInstance(39);
		case 5:
			return DonghuaFragment.newInstance(96);
		case 6:
			return DonghuaFragment.newInstance(95);
		default:
			return DonghuaFragment.newInstance(36);
		}
		
		// MainFragment fragment = new MainFragment(position);
		// return fragment;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// 返回页面标题
		return DONG_HUA_TITLE[position % DONG_HUA_TITLE.length].toUpperCase();
	}

	@Override
	public int getCount() {
		// 页面个数
		return DONG_HUA_TITLE.length;
	}

}

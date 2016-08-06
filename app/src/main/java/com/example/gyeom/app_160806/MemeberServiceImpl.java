package com.example.gyeom.app_160806;

import android.content.Context;

/**
 * Created by 1027 on 2016-08-06.
 */
public class MemeberServiceImpl implements MemberService {

    public MemeberServiceImpl(Context context) {
        this.dao = new MemberDAO(context);
    }

    MemberDAO dao;


    @Override
    public void login(MemberBean member) {

    }

    @Override
    public void join(MemberBean member) {

    }
}

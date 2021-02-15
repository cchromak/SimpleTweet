package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    public String screeName;
    public String publicImageUrl;

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screeName = jsonObject.getString("screen_name");
        user.publicImageUrl = jsonObject.getString("proflie_img_url_https");
        return user;
    }
}
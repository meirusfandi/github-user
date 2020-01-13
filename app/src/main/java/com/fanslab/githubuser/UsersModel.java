package com.fanslab.githubuser;

import android.os.Parcel;
import android.os.Parcelable;

public class UsersModel implements Parcelable {

    private String userName;
    private String userEmail;
    private String userPhoto;

    public UsersModel() {
    }

    public UsersModel(String userName, String userEmail, String userPhoto) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhoto = userPhoto;
    }

    private UsersModel(Parcel in) {
        userName = in.readString();
        userEmail = in.readString();
        userPhoto = in.readString();
    }

    public static final Creator<UsersModel> CREATOR = new Creator<UsersModel>() {
        @Override
        public UsersModel createFromParcel(Parcel in) {
            return new UsersModel(in);
        }

        @Override
        public UsersModel[] newArray(int size) {
            return new UsersModel[size];
        }
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userName);
        dest.writeString(userEmail);
        dest.writeString(userPhoto);
    }
}

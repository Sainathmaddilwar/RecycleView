package com.example.recycleview;

public class ListData {
    private int imgid;
    private String name;
    private String name2;
public ListData(int imgid, String name, String name2)
{
    this.imgid=imgid;
    this.name=name;
    this.name2=name2;

}
    public int getImgid()
    {
        return imgid;
    }
    public String getName()
    {
        return name;
    }
    public String getName2()
    {
        return name2;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}

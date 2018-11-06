package com.example.weather;

public class ItemBean {
	public String Itmedate,ItmeMax,ItmeMin;
    public String ItemTitle;
    public String ItemContent;
    int ItemImageResid;
    
    public ItemBean(String itmedate,int itemImageResid, String itemTitle, String itemContent, String itmeMax,String itmeMin) {
        ItemTitle = itemTitle;
        ItemContent = itemContent;
        Itmedate=itmedate;
        ItmeMax=itmeMax;
        ItmeMin=itmeMin;
        ItemImageResid=itemImageResid;
        
    }
}

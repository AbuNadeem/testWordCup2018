package com.abunadeem.newapp.data.network.connection;


import static com.abunadeem.newapp.data.contract.AUTHORITY;

/**
 * Created by ibrahim on 19/01/18.
 */

public class UtilsApi {
    public static BaseApiService getAPIService(){
        return RetroConnect.getClient(AUTHORITY).create(BaseApiService.class);
    }    }
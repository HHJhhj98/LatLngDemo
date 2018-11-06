package com.example.weather;

import java.util.List;


public class WeatherBean {

    private List<HeWeather5Bean> HeWeather5;

    public List<HeWeather5Bean> getHeWeather5() {
        return HeWeather5;
    }

    public void setHeWeather5(List<HeWeather5Bean> HeWeather5) {
        this.HeWeather5 = HeWeather5;
    }

    public static class HeWeather5Bean {
    	/**
         * aqi : {"city":{"aqi":"72","co":"1","no2":"54","o3":"76","pm10":"92","pm25":"52","qlty":"�?,"so2":"12"}}
         * basic : {"city":"杭州","cnty":"中国","id":"CN101210101","lat":"30.287459","lon":"120.153576","update":{"loc":"2017-05-06 22:51","utc":"2017-05-06 14:51"}}
         * daily_forecast : [{"astro":{"mr":"14:33","ms":"02:34","sr":"05:12","ss":"18:40"},"cond":{"code_d":"305","code_n":"101","txt_d":"小雨","txt_n":"多云"},"date":"2017-05-06","hum":"74","pcpn":"0.2","pop":"88","pres":"1019","tmp":{"max":"26","min":"16"},"uv":"10","vis":"13","wind":{"deg":"99","dir":"东北�?,"sc":"3-4","spd":"16"}},{"astro":{"mr":"15:28","ms":"03:10","sr":"05:11","ss":"18:40"},"cond":{"code_d":"104","code_n":"300","txt_d":"�?,"txt_n":"阵雨"},"date":"2017-05-07","hum":"65","pcpn":"1.0","pop":"65","pres":"1017","tmp":{"max":"26","min":"16"},"uv":"11","vis":"18","wind":{"deg":"79","dir":"东风","sc":"微风","spd":"8"}},{"astro":{"mr":"16:22","ms":"03:44","sr":"05:10","ss":"18:41"},"cond":{"code_d":"306","code_n":"300","txt_d":"中雨","txt_n":"阵雨"},"date":"2017-05-08","hum":"78","pcpn":"14.6","pop":"100","pres":"1011","tmp":{"max":"20","min":"18"},"uv":"8","vis":"16","wind":{"deg":"178","dir":"西南�?,"sc":"微风","spd":"6"}}]
         * hourly_forecast : []
         * now : {"cond":{"code":"101","txt":"多云"},"fl":"21","hum":"78","pcpn":"0","pres":"1019","tmp":"20","vis":"8","wind":{"deg":"120","dir":"东南�?,"sc":"微风","spd":"7"}}
         * status : ok
         * suggestion : {"air":{"brf":"�?,"txt":"气象条件对空气污染物�?��、扩散和清除无明显影响，易感人群应�?当减少室外活动时间�?"},"comf":{"brf":"较舒�?,"txt":"白天天气晴好，同时较大的空气湿度，会使您在午后略感闷热，但早晚仍很凉爽�?舒�?�?},"cw":{"brf":"较�?�?,"txt":"较�?宜洗车，未来�?��无雨，风力较小，擦洗�?��的汽车至少能保持�?���?},"drsg":{"brf":"舒�?","txt":"建议�?��袖T恤�?衬衫加单裤等服装。年老体弱�?宜着针织长袖衬衫、马甲和长裤�?},"flu":{"brf":"较易�?,"txt":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意�?当防护�?"},"sport":{"brf":"较不�?,"txt":"天气较好，但因风力较强，在户外要选择合�?的运动；另外考虑到高温天气，建议停止高强度运动�?"},"trav":{"brf":"适宜","txt":"天气较好，温度�?宜，但风稍微有点大�?这样的天气�?宜旅游，您可以尽情地享受大自然的无限风光�?},"uv":{"brf":"�?,"txt":"紫外线强度较弱，建议出门前涂擦SPF�?2-15之间、PA+的防晒护肤品�?}}
         */

        private AqiBean aqi;
        private BasicBean basic;
        private NowBean now;
        private String status;
        private SuggestionBean suggestion;
        private List<DailyForecastBean> daily_forecast;
        private List<?> hourly_forecast;

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<?> getHourly_forecast() {
            return hourly_forecast;
        }

        public void setHourly_forecast(List<?> hourly_forecast) {
            this.hourly_forecast = hourly_forecast;
        }

        public static class AqiBean {
        	/**
             * city : {"aqi":"72","co":"1","no2":"54","o3":"76","pm10":"92","pm25":"52","qlty":"�?,"so2":"12"}
             */

            private CityBean city;

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public static class CityBean {
            	/**
                 * aqi : 72
                 * co : 1
                 * no2 : 54
                 * o3 : 76
                 * pm10 : 92
                 * pm25 : 52
                 * qlty : �?
                 * so2 : 12
                 */

                private String aqi;
                private String co;
                private String no2;
                private String o3;
                private String pm10;
                private String pm25;
                private String qlty;
                private String so2;

                public String getAqi() {
                    return aqi;
                }

                public void setAqi(String aqi) {
                    this.aqi = aqi;
                }

                public String getCo() {
                    return co;
                }

                public void setCo(String co) {
                    this.co = co;
                }

                public String getNo2() {
                    return no2;
                }

                public void setNo2(String no2) {
                    this.no2 = no2;
                }

                public String getO3() {
                    return o3;
                }

                public void setO3(String o3) {
                    this.o3 = o3;
                }

                public String getPm10() {
                    return pm10;
                }

                public void setPm10(String pm10) {
                    this.pm10 = pm10;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public String getQlty() {
                    return qlty;
                }

                public void setQlty(String qlty) {
                    this.qlty = qlty;
                }

                public String getSo2() {
                    return so2;
                }

                public void setSo2(String so2) {
                    this.so2 = so2;
                }
            }
        }

        public static class BasicBean {
        	 /**
             * city : 杭州
             * cnty : 中国
             * id : CN101210101
             * lat : 30.287459
             * lon : 120.153576
             * update : {"loc":"2017-05-06 22:51","utc":"2017-05-06 14:51"}
             */

            private String city;
            private String cnty;
            private String id;
            private String lat;
            private String lon;
            private UpdateBean update;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
            	 /**
                 * loc : 2017-05-06 22:51
                 * utc : 2017-05-06 14:51
                 */

                private String loc;
                private String utc;

                public String getLoc() {
                    return loc;
                }

                public void setLoc(String loc) {
                    this.loc = loc;
                }

                public String getUtc() {
                    return utc;
                }

                public void setUtc(String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class NowBean {
        	/**
             * "now": {  //实况天气
                "cond": {  //天气状况
                    "code": "104",  //天气状况代码
                    "txt": "�?  //天气状况描述
                },
                "fl": "11",  //体感温度
                "hum": "31",  //相对湿度�?�?
                "pcpn": "0",  //降水量（mm�?
                "pres": "1025",  //气压
                "tmp": "13",  //温度
                "vis": "10",  //能见度（km�?
                "wind": {  //风力风向
                    "deg": "40",  //风向�?60度）
                    "dir": "东北�?,  //风向
                    "sc": "4-5",  //风力
                    "spd": "24"  //风�?（kmph�?
                }
            },
             */

            private CondBean cond;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private WindBean wind;

            public CondBean getCond() {
                return cond;
            }

            public void setCond(CondBean cond) {
                this.cond = cond;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public static class CondBean {
            	/**
                 * code : 101
                 * txt : 多云
                 */

                private String code;
                private String txt;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class WindBean {
            	/**
                 * deg : 120
                 * dir : 东南�?
                 * sc : 微风
                 * spd : 7
                 */

                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }

        public static class SuggestionBean {
        	 /**
             * air : {"brf":"�?,"txt":"气象条件对空气污染物�?��、扩散和清除无明显影响，易感人群应�?当减少室外活动时间�?"}
             * comf : {"brf":"较舒�?,"txt":"白天天气晴好，同时较大的空气湿度，会使您在午后略感闷热，但早晚仍很凉爽�?舒�?�?}
             * cw : {"brf":"较�?�?,"txt":"较�?宜洗车，未来�?��无雨，风力较小，擦洗�?��的汽车至少能保持�?���?}
             * drsg : {"brf":"舒�?","txt":"建议�?��袖T恤�?衬衫加单裤等服装。年老体弱�?宜着针织长袖衬衫、马甲和长裤�?}
             * flu : {"brf":"较易�?,"txt":"天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意�?当防护�?"}
             * sport : {"brf":"较不�?,"txt":"天气较好，但因风力较强，在户外要选择合�?的运动；另外考虑到高温天气，建议停止高强度运动�?"}
             * trav : {"brf":"适宜","txt":"天气较好，温度�?宜，但风稍微有点大�?这样的天气�?宜旅游，您可以尽情地享受大自然的无限风光�?}
             * uv : {"brf":"�?,"txt":"紫外线强度较弱，建议出门前涂擦SPF�?2-15之间、PA+的防晒护肤品�?}
             */

            private AirBean air;
            private ComfBean comf;
            private CwBean cw;
            private DrsgBean drsg;
            private FluBean flu;
            private SportBean sport;
            private TravBean trav;
            private UvBean uv;

            public AirBean getAir() {
                return air;
            }

            public void setAir(AirBean air) {
                this.air = air;
            }

            public ComfBean getComf() {
                return comf;
            }

            public void setComf(ComfBean comf) {
                this.comf = comf;
            }

            public CwBean getCw() {
                return cw;
            }

            public void setCw(CwBean cw) {
                this.cw = cw;
            }

            public DrsgBean getDrsg() {
                return drsg;
            }

            public void setDrsg(DrsgBean drsg) {
                this.drsg = drsg;
            }

            public FluBean getFlu() {
                return flu;
            }

            public void setFlu(FluBean flu) {
                this.flu = flu;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public TravBean getTrav() {
                return trav;
            }

            public void setTrav(TravBean trav) {
                this.trav = trav;
            }

            public UvBean getUv() {
                return uv;
            }

            public void setUv(UvBean uv) {
                this.uv = uv;
            }

            public static class AirBean {
            	 /**
                 * brf : �?
                 * txt : 气象条件对空气污染物�?��、扩散和清除无明显影响，易感人群应�?当减少室外活动时间�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class ComfBean {
            	/**
                 * brf : 较舒�?
                 * txt : 白天天气晴好，同时较大的空气湿度，会使您在午后略感闷热，但早晚仍很凉爽�?舒�?�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class CwBean {
            	/**
                 * brf : 较�?�?
                 * txt : 较�?宜洗车，未来�?��无雨，风力较小，擦洗�?��的汽车至少能保持�?���?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class DrsgBean {
            	/**
                 * brf : 舒�?
                 * txt : 建议�?��袖T恤�?衬衫加单裤等服装。年老体弱�?宜着针织长袖衬衫、马甲和长裤�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class FluBean {
            	/**
                 * brf : 较不�?
                 * txt : 天气较好，但因风力较强，在户外要选择合�?的运动；另外考虑到高温天气，建议停止高强度运动�?
                 */


                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class SportBean {
            	/**
                 * brf : 适宜
                 * txt : 天气较好，温度�?宜，但风稍微有点大�?这样的天气�?宜旅游，您可以尽情地享受大自然的无限风光�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class TravBean {
            	/**
                 * brf : �?
                 * txt : 紫外线强度较弱，建议出门前涂擦SPF�?2-15之间、PA+的防晒护肤品�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class UvBean {
            	/**
                 * brf : �?
                 * txt : 紫外线强度较弱，建议出门前涂擦SPF�?2-15之间、PA+的防晒护肤品�?
                 */

                private String brf;
                private String txt;

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * astro : {"mr":"14:33","ms":"02:34","sr":"05:12","ss":"18:40"}
             * cond : {"code_d":"305","code_n":"101","txt_d":"灏忛�?,"txt_n":"澶氫�?}
             * date : 2017-05-06
             * hum : 74
             * pcpn : 0.2
             * pop : 88
             * pres : 1019
             * tmp : {"max":"26","min":"16"}
             * uv : 10
             * vis : 13
             * wind : {"deg":"99","dir":"涓滃寳椋�?"sc":"3-4","spd":"16"}
             */

            private AstroBean astro;
            private CondBeanX cond;
            private String date;
            private String hum;
            private String pcpn;
            private String pop;
            private String pres;
            private TmpBean tmp;
            private String uv;
            private String vis;
            private WindBeanX wind;

            public AstroBean getAstro() {
                return astro;
            }

            public void setAstro(AstroBean astro) {
                this.astro = astro;
            }

            public CondBeanX getCond() {
                return cond;
            }

            public void setCond(CondBeanX cond) {
                this.cond = cond;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public TmpBean getTmp() {
                return tmp;
            }

            public void setTmp(TmpBean tmp) {
                this.tmp = tmp;
            }

            public String getUv() {
                return uv;
            }

            public void setUv(String uv) {
                this.uv = uv;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public WindBeanX getWind() {
                return wind;
            }

            public void setWind(WindBeanX wind) {
                this.wind = wind;
            }

            public static class AstroBean {
            	/**
                 * mr : 14:33
                 * ms : 02:34
                 * sr : 05:12
                 * ss : 18:40
                 */

                private String mr;
                private String ms;
                private String sr;
                private String ss;

                public String getMr() {
                    return mr;
                }

                public void setMr(String mr) {
                    this.mr = mr;
                }

                public String getMs() {
                    return ms;
                }

                public void setMs(String ms) {
                    this.ms = ms;
                }

                public String getSr() {
                    return sr;
                }

                public void setSr(String sr) {
                    this.sr = sr;
                }

                public String getSs() {
                    return ss;
                }

                public void setSs(String ss) {
                    this.ss = ss;
                }
            }

            public static class CondBeanX {
            	/**
                 * code_d : 305
                 * code_n : 101
                 * txt_d : 小雨
                 * txt_n : 多云
                 */

                private String code_d;
                private String code_n;
                private String txt_d;
                private String txt_n;

                public String getCode_d() {
                    return code_d;
                }

                public void setCode_d(String code_d) {
                    this.code_d = code_d;
                }

                public String getCode_n() {
                    return code_n;
                }

                public void setCode_n(String code_n) {
                    this.code_n = code_n;
                }

                public String getTxt_d() {
                    return txt_d;
                }

                public void setTxt_d(String txt_d) {
                    this.txt_d = txt_d;
                }

                public String getTxt_n() {
                    return txt_n;
                }

                public void setTxt_n(String txt_n) {
                    this.txt_n = txt_n;
                }
            }

            public static class TmpBean {
            	/**
                 * max : 26
                 * min : 16
                 */

                private String max;
                private String min;

                public String getMax() {
                    return max;
                }

                public void setMax(String max) {
                    this.max = max;
                }

                public String getMin() {
                    return min;
                }

                public void setMin(String min) {
                    this.min = min;
                }
            }

            public static class WindBeanX {
            	/**
                 * deg : 99
                 * dir : 东北�?
                 * sc : 3-4
                 * spd : 16
                 */

                private String deg;
                private String dir;
                private String sc;
                private String spd;

                public String getDeg() {
                    return deg;
                }

                public void setDeg(String deg) {
                    this.deg = deg;
                }

                public String getDir() {
                    return dir;
                }

                public void setDir(String dir) {
                    this.dir = dir;
                }

                public String getSc() {
                    return sc;
                }

                public void setSc(String sc) {
                    this.sc = sc;
                }

                public String getSpd() {
                    return spd;
                }

                public void setSpd(String spd) {
                    this.spd = spd;
                }
            }
        }
    }
}

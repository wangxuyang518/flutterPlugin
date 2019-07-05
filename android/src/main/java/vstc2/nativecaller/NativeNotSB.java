package vstc2.nativecaller;

/**
 * Created by chenqianghua on 2018/3/13.
 */

public class NativeNotSB {

    public static int alarm_audio;
    public static int motion_sensivity;
    public static int input_armed;
    public static int ioin_level;
    public static int iolinkage;
    public static int ioout_level;
    public static int alarmpresetsit;
    public static int mail;
    public static int snapshot;
    public static int record;
    public static int upload_interval;
    public static int schedule_enable;
    public static int schedule_sun_0;
    public static int schedule_sun_1;
    public static int schedule_sun_2;
    public static int schedule_mon_0;
    public static int schedule_mon_1;
    public static int schedule_mon_2;
    public static int schedule_tue_0;
    public static int schedule_tue_1;
    public static int schedule_tue_2;
    public static int schedule_wed_0;
    public static int schedule_wed_1;
    public static int schedule_wed_2;
    public static int schedule_thu_0;
    public static int schedule_thu_1;
    public static int schedule_thu_2;
    public static int schedule_fri_0;
    public static int schedule_fri_1;
    public static int schedule_fri_2;
    public static int schedule_sat_0;
    public static int schedule_sat_1;
    public static int schedule_sat_2;
    public static int defense_plan1;
    public static int defense_plan2;
    public static int defense_plan3;
    public static int defense_plan4;
    public static int defense_plan5;
    public static int defense_plan6;
    public static int defense_plan7;
    public static int defense_plan8;
    public static int defense_plan9;
    public static int defense_plan10;
    public static int defense_plan11;
    public static int defense_plan12;
    public static int defense_plan13;
    public static int defense_plan14;
    public static int defense_plan15;
    public static int defense_plan16;
    public static int defense_plan17;
    public static int defense_plan18;
    public static int defense_plan19;
    public static int defense_plan20;
    public static int defense_plan21;
    public static int remind_rate;



    /**
     * 设置移动侦测报警信息
     * @param did
     * @return
     */
    public static int settingAlarmOpen(String did){
        int motion_armed = 1;
        return NativeCaller.PPPPAlarmSetting( did, 0,
                1,
                2,
                0, 0,
                0, 0,
                0, 0,
                0, 0,
                0,
                0,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
                0xFFFFFFFF,0xFFFFFFFF,-1);

    }


    public static int settingAlarmClose(String did){
        int motion_armed = 0;
        return NativeCaller.PPPPAlarmSetting( did,  alarm_audio,
                motion_armed,  motion_sensivity,  input_armed,
                ioin_level,  iolinkage,  ioout_level,  alarmpresetsit,
                mail,  snapshot,  record,  upload_interval,
                schedule_enable,  schedule_sun_0,  schedule_sun_1,
                schedule_sun_2,  schedule_mon_0,  schedule_mon_1,
                schedule_mon_2,  schedule_tue_0,  schedule_tue_1,
                schedule_tue_2,  schedule_wed_0,  schedule_wed_1,
                schedule_wed_2,  schedule_thu_0,  schedule_thu_1,
                schedule_thu_2,  schedule_fri_0,  schedule_fri_1,
                schedule_fri_2,  schedule_sat_0,  schedule_sat_1,
                schedule_sat_2,  defense_plan1,  defense_plan2,
                defense_plan3,  defense_plan4,  defense_plan5,
                defense_plan6,  defense_plan7,  defense_plan8,
                defense_plan9,  defense_plan10,  defense_plan11,
                defense_plan12,  defense_plan13,  defense_plan14,
                defense_plan15,  defense_plan16,  defense_plan17,
                defense_plan18,  defense_plan19,  defense_plan20,
                defense_plan21,  remind_rate);
    }

}

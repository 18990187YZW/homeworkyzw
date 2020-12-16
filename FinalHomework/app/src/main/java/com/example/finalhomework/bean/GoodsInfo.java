package com.example.finalhomework.bean;

import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone12", "Watch", "ipad", "HUAWEI Mate30", "小米10", "vivo","OPPO","三星","联想笔记本", "惠普战66", "戴尔灵越", "七彩虹火神", "键盘"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 (A2404) 64GB 白色 支持移动联通电信5G 双卡双待手机",
            "Apple Watch SE 智能手表 GPS款 40毫米深空灰色铝金属表壳 黑色运动型表带MYDP2CH/A",
            "Apple iPad 10.2英寸 平板电脑（ 2020年新款 32G WLAN版/Retina显示屏/A12仿生芯片MYLC2CH/A）金色",
            "华为 HUAWEI Mate 30E Pro 5G麒麟990E SoC芯片 双4000万徕卡电影影像 8GB+128GB亮黑色全网通手机",
            "小米10青春版 双模5G 骁龙765G 50倍潜望式变焦四摄 6GB+128GB 蓝莓薄荷 游戏手机",
            "vivo Y73s 5G手机 8GB+128GB 银月 AMOLED高清护眼屏 4800万影像系统 5G全网通智能手机",
            "OPPO K7 双模5G 骁龙765G OLED屏幕指纹 4800万超清四摄 3200万前摄 8+128GB 秘境 全网通手机",
            " 三星 Galaxy S20 FE 5G(SM-G7810)双模5G 骁龙865 120Hz屏幕刷新率 多彩雾面质感 游戏手机 8GB+128GB 异想蓝",
            "联想(Lenovo)小新Air14 2021款性能版轻薄本 英特尔酷睿i5 14英寸全面屏笔记本电脑(i5-1135G7 16G 512G MX450独显 100%sRGB)银",
            "惠普（HP）战66 四代 14英寸轻薄笔记本电脑（英特尔酷睿11代i5 16G 512G MX450 高色域 一年上门+意外）",
            "戴尔DELL灵越5000 14英寸酷睿i5网课学习轻薄笔记本电脑(十代i5-1035G1 8G 512G MX230 2G独显)银",
            "七彩虹（Colorful）火神iGame GeForce RTX 3080 Vulcan OC 10G 1710-1800Mhz GDDR6X 电竞游戏电脑独立显卡",
            "雷柏（Rapoo） V500PRO 机械键盘 有线键盘 游戏键盘 104键混光键盘 吃鸡键盘 电脑键盘 黑色 青轴"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6299, 2199, 2499, 5299, 1899, 1998,1699,4999,5699,5999,4199,6999,118};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone12_s, R.drawable.watch_s, R.drawable.ipad_s,
            R.drawable.huawei_s, R.drawable.xiaomi_s, R.drawable.vivo_s, R.drawable.oppo_s, R.drawable.sanxing_s, R.drawable.lenovo_s, R.drawable.
            hp66_s,R.drawable.dellly_s,R.drawable.colorful_s,R.drawable.jp_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone12, R.drawable.watch, R.drawable.ipad,
            R.drawable.huawei, R.drawable.xiaomi, R.drawable.vivo,
            R.drawable.oppo, R.drawable.sanxing,R.drawable.lenovo,R.drawable.hp66,R.drawable.dellly,R.drawable.colorful,R.drawable.jp
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"外设", "电器", "百货", "充值",
            "手机", "手表", "电脑", "杂货", "超市", "分类"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}

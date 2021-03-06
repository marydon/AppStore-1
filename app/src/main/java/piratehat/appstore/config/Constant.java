package piratehat.appstore.config;

/**
 * Created by PirateHat on 2018/10/27.
 */

public class Constant {
    public static final int CONNECT_TIMEOUT = 6;
    public static final int READ_TIMEOUT = 100;
    public static final int WRITE_TIMEOUT = 60;


    public static final String USER_AGENT = "User-Agent";
    public static final String USER_AGENT_VALUE = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.62 Safari/537.36";

    public static final String SOFEWARE[][] = new String[][]{
            {"在线视频", "播放器", "短视频 ", "直播"},
            {"新闻", "电子书", "漫画", "轻阅读", "八卦段子", "听书"},
            {"聊天交友", "婚恋", "社区交友", "表情头像"},
            {"贷款", "手机银行", "彩票投注", "支付钱包", "投资理财", "记账"},
            {"在线商城", "导购优惠", "二手商城", "生鲜电商", "海淘", "物流快递"},
            {"浏览器", "输入法", "WIFI", "娱乐工具", "生活工具", "通讯工具"},
            {"相机", "图片编辑", "视频编辑", "图片分享"},
            {"在线音乐", "K歌", "FM电台", "乐器", "铃声"},
            {"餐饮美食", "求职招聘", "汽车服务", "生活服务", "住房装修", "票务"},
            {"学生学习", "儿童早教", "外语学习", "成人学习", "驾照"},
            {"地图导航", "打车租车", "火车票", "旅游服务", "旅游攻略", "城市交通"},
            {"手机美化", "垃圾清理", "安全服务", "省电文件", "服务root"},
            {"运动健身", "医疗用药", "健康养生", "经期孕期", "美容美体"},
            {"办公软件", "笔记", "商家办公", "邮箱"},
            {"母婴健康", "游戏辅助"}};
    public static final String GAME[][] = new String[][]{

            {"休闲", "捕鱼", "消除", "单机", "益智", "女生"},
            {"三国", "二次元", "西游", "仙侠", "热血", "动漫"},
            {"斗地主", "棋类", "麻将", "纸牌"},
            {"MOBA", "射击", "争霸", "音乐节奏"},
            {"跑酷", "格斗", "动作", "横板", "闯关", "街机"},
            {"塔防", "经营", "模拟", "养成", "沙盘", "策略"},
            {"卡牌", "回合", "RPG", "武侠", "魔幻", "多人在线"},
            {"足球", "篮球", "摩托", "赛车", "台球", "运动"},
            {"国战", "飞行", "射击", "坦克", "枪战", "海战", "合金弹头"},
            {"烧脑", "手残勿点", "时间杀手", "魔性", "生存", "有毒"
            }};

    public static final String[] SOFTWARE_CATEGORY = new String[]{"视频", "阅读", "社交", "理财", "购物", "工具",
            "摄影", "音乐", "生活", "教育", "旅游出行", "系统", "健康", "办公", "特色分类"};
    public static final String[] GAME_CATEGORY = new String[]{"休闲益智", "网络游戏", "棋牌中心", "电子竞技", "动作冒险", "经营策略", "角色扮演", "体育竞速", "军事战争", "特色分类"};


    //休闲益智 147
    //网络游戏 121
    //飞行射击 149
    //动作冒险 144
    //体育竞速 151
    //棋牌中心 148
    //经营策略 153
    //角色扮演 146
    public static final String[] CAME_CATEGORIES = new String[]{
            "休闲益智",
            "网络游戏",
            "飞行射击",
            "动作冒险",
            "体育竞速",
            "棋牌中心",
            "经营策略",
            "角色扮演",
    };

    public static final int[] CAME_CATEGORY_ID = new int[]{147, 121, 149, 144, 151, 148, 153, 146};

    //购物 122
    //阅读 102
    //新闻 110
    //视频 103
    //旅游 108
    //工具 115
    //社交 106
    //音乐 101
    //美化 119
    //摄影 104
    //理财 114
    //系统 117
    //生活 107
    //出行 112
    //安全 118
    //教育 111
    //健康 109
    //娱乐 105
    //儿童 100
    //办公 113
    //通讯 116
    public static final String[] SOFTWARE_CATEGORIES = new String[]{
            "购物",
            "阅读",
            "新闻",
            "视频",
            "旅游",
            "工具",
            "社交",
            "音乐",
            "美化",
            "摄影",
            "理财",
            "系统",
            "生活",
            "出行",
            "安全",
            "教育",
            "健康",
            "娱乐",
            "儿童",
            "办公",
            "通讯"
    };

    public static final int[] SOFTWARE_CATEGORY_ID = new int[]{
            122,102,110,103,108,115,106,101,119,104,114,117,107,112,118,111,109,105,100,113,116
    };

    public static final int DOWN = 0;
    public static final int RUNNING = 1;
    public static final int CLEAR_DOWN = 2;

    /**
     * DiskCache
     */
    public static final long CACHE_MAXSIZE = 10 * 1024 * 1024;


    //SecretUtil
    public static String NOSUCHALGORITHM = "不支持此种加密方式";
    public static String UNSUPPENCODING = "不支持的编码格式";



}

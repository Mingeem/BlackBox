package top.niunaijun.bcore.core.system.am;

import android.os.IBinder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Milk on 4/25/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class UserSpace {
    // 单实例
    public final ActiveServices mActiveServices = new ActiveServices();
    // 单实例
    public final ActivityStack mStack = new ActivityStack();
    public final Map<IBinder, PendingIntentRecord> mIntentSenderRecords = new HashMap<>();
}
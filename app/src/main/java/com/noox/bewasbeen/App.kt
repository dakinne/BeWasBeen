package com.noox.bewasbeen

import android.app.Application
import com.google.firebase.firestore.FirebaseFirestore

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initData()
    }

    private fun initData() {
        val collection = FirebaseFirestore.getInstance().collection("verbs")

        verbs().forEach {
            collection.document(it.baseForm).set(it)
        }
    }

    private fun verbs() = listOf(
        Verb("awake",	"awoke",	"awoken"),
        Verb("be", "was, were",	"been"),
        Verb("beat", "beat",	"beaten"),
        Verb("become",	"became", "become"),
        Verb("begin",	"began", "begun"),
        Verb("bend", "bent", "bent"),
        Verb("bet", "bet", "bet"),
        Verb("bid", "bid", "bid"),
        Verb("bite", "bit", "bitten"),
        Verb("blow", "blew", "blown"),
        Verb("break", "broke", "broken"),
        Verb("bring", "brought", "brought"),
        Verb("broadcast", "broadcast", "broadcast"),
        Verb("build", "built", "built"),
        Verb("burn", "burned or burnt", "burned or burnt"),
        Verb("buy", "bought", "bought"),
        Verb("catch", "caught", "caught"),
        Verb("choose", "chose", "chosen"),
        Verb("come", "came", "come"),
        Verb("cost", "cost", "cost"),
        Verb("cut", "cut", "cut"),
        Verb("dig", "dug", "dug"),
        Verb("do", "did", "done"),
        Verb("draw", "drew", "drawn"),
        Verb("dream", "dreamed or dreamt", "dreamed or dreamt"),
        Verb("drive", "drove", "driven"),
        Verb("drink", "drank", "drunk"),
        Verb("eat", "ate", "eaten"),
        Verb("fall", "fell", "fallen"),
        Verb("feel", "felt", "felt"),
        Verb("fight", "fought", "fought"),
        Verb("find", "found", "found"),
        Verb("fly", "flew", "flown"),
        Verb("forget", "forgot", "forgotten"),
        Verb("forgive", "forgave", "forgiven"),
        Verb("freeze", "froze", "frozen"),
        Verb("get", "got", "got, gotten"),
        Verb("give", "gave", "given"),
        Verb("go", "went", "gone"),
        Verb("grow", "grew", "grown"),
        Verb("hang", "hung", "hung"),
        Verb("have", "had", "had"),
        Verb("hear", "heard", "heard"),
        Verb("hide", "hid", "hidden"),
        Verb("hit", "hit", "hit"),
        Verb("hold", "held", "held"),
        Verb("hurt", "hurt", "hurt"),
        Verb("keep", "kept", "kept"),
        Verb("know", "knew", "known"),
        Verb("lay", "laid", "laid"),
        Verb("lead", "led", "led"),
        Verb("learn", "learned or learnt", "learned or learnt"),
        Verb("leave", "left", "left"),
        Verb("lend", "lent", "lent"),
        Verb("let", "let", "let"),
        Verb("lie", "lay", "lain"),
        Verb("lose", "lost", "lost"),
        Verb("make", "made", "made"),
        Verb("mean", "meant", "meant"),
        Verb("meet", "met", "met"),
        Verb("pay", "paid", "paid"),
        Verb("put", "put", "put"),
        Verb("read", "read", "read"),
        Verb("ride", "rode", "ridden"),
        Verb("ring", "rang", "rung"),
        Verb("rise", "rose", "risen"),
        Verb("run", "ran", "run"),
        Verb("say", "said", "said"),
        Verb("see", "saw", "seen"),
        Verb("sell", "sold", "sold"),
        Verb("send", "sent", "sent"),
        Verb("show", "showed", "showed or shown"),
        Verb("shut", "shut", "shut"),
        Verb("sing", "sang", "sung"),
        Verb("sink", "sank", "sunk"),
        Verb("sit", "sat", "sat"),
        Verb("sleep", "slept", "slept"),
        Verb("speak", "spoke", "spoken"),
        Verb("spend", "spent", "spent"),
        Verb("stand", "stood", "stood"),
        Verb("stink", "stank", "stunk"),
        Verb("swim", "swam", "swum"),
        Verb("take", "took", "taken"),
        Verb("teach", "taught", "taught"),
        Verb("tear", "tore", "torn"),
        Verb("tell", "told", "told"),
        Verb("think", "thought", "thought"),
        Verb("throw", "threw", "thrown"),
        Verb("understand", "understood", "understood"),
        Verb("wake", "woke", "woken"),
        Verb("wear", "wore", "worn"),
        Verb("win", "won", "won"),
        Verb("write", "wrote", "written")
    )
}
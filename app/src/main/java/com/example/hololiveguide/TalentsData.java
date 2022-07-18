package com.example.hololiveguide;

import android.content.Intent;

import java.util.ArrayList;

public class TalentsData {
    private static final String [] talentNames = {
            "Tokino Sora",
            "Roboco",
            "Sakura Miko",
            "Hoshimachi Suisei",
            "Azki",
            "Yozora Mel",
            "Shirakami Fubuki",
            "Natsuiro Matsuri",
            "Aki Rosenthal",
            "Akai Haato"
    };

    private static final String[] hololiveGen = {
            "Solo Debutant",
            "Solo Debutant",
            "Solo Debutant",
            "Solo Debutant",
            "INoNaka MUSIC",
            "hololive 1st Generation",
            "hololive 1st Generation",
            "hololive 1st Generation",
            "hololive 1st Generation",
            "hololive 1st Generation"
    };

    private static final String[] talentQuotes = {
            "\"Sora tomo no minna, genki? Toki no Sora desu!\""+ "\n(How are you, all of my Sorafriends? It's Tokino Sora!)",
            "\"haroーbo〜\""+"\n(Hellobo~)",
            "\"Ni hharo -! sakura miko da yo !\""+"\n(Nya-hello! It's Sakura Miko!)",
            "\"Suisei no gotoku arawareta star no genseki! aidoru VTuber no hoshigai Suisei desu!\""+"\n(It's your shooting star, your diamond in the rough, idol VTuber Hoshimachi Suisei!)",
            "",
            "\"Konkapu Konkapu Yozora Mel dayo!\""+"\n(Sweet bites! It's Yozora Mel!)",
            "\"Konban kitsune!Shirakami Fubuki desu!\""+"\n(Foxy day to you! I'm Shirakami Fubuki!)",
            "\"Konbanwassho-i! Natsuiro Matsuri desu!\""+"\n(Festival night! Natsuiro Matsuri is here!)",
            "\"Kon ban aro-na! akiroze koto akiro-zenta-ru desu!\""+"\n(Alona, everyone! This is Aki Rosenthal a.k.a. AkiRose!)",
            "\"Haachama-chama\""
    };

    private static final String[] talentDesc = {
            //Tokino Sora
            "Tokino Sora (ときのそら, 時乃そら, 時乃空, Lit. Sky of Time) is a female Japanese Virtual YouTuber and the founder member of hololive.+" +
                    "While she debuted alone way before generations were established, she is currently part of  \"hololive 0th gen\"" +
                    "longside fellow solo debutants: Roboco, Sakura Miko, Hoshimachi Suisei and AZKi",
            //Roboco-san
            "Roboco (ロボ子, Robo-ko, lit. Robogirl) also known as \"Roboco-san\" is a female Japanese virtual YouTuber and the second member ever of hololive. While she debuted alone way before generations were established, she is currently part of \"hololive 0th gen\" alongside fellow solo debutants: Tokino Sora, Sakura Miko, Hoshimachi Suisei and AZKi.",
            //Sakura Miko
            "Sakura Miko (さくらみこ, Kanji: 桜巫女, Hanzi:樱巫女) is a female Japanese Virtual YouTuber and a member of hololive. While debuting alone outside of a generation and working directly under Cover Corp. before being transfered to hololive, she is currently part of \"hololive 0th gen\" alongside fellow solo debutants: Tokino Sora, Roboco, Hoshimachi Suisei and AZKi.",
            //Hoshimachi Suisei
            "Hoshimachi Suisei (星街すいせい) is a female Japanese Virtual YouTuber associated with hololive. While originally an independent VTuber who eventually was recruited into hololive, she is currently part of \"hololive 0th gen\" alongside fellow solo debutants: Tokino Sora, Roboco, Sakura Miko and AZKi.",
            //AZki
            "Virtual Diva AZKi better known simply as AZKi is a female Japanese Virtual YouTuber and singer. Her concept was conceived by hololive's parent company: COVER Corporation and her design and videos are produced by Composition Inc. While she debuted alone, she is currently part of \"hololive 0th gen\" alongside fellow solo debutants: Tokino Sora, Roboco, Sakura Miko and Hoshimachi Suisei.",
            //Yozora Mel
            "Yozora Mel (夜空メル) is a female Japanese Virtual YouTuber associated with hololive, debuting as part of its first generation of VTubers alongside Aki Rosenthal, Natsuiro Matsuri, Shirakami Fubuki and Akai Haato.",
            //Shirakami Fubuki
            "Shirakami Fubuki (白上フブキ) is a female Japanese Virtual Youtuber associated with hololive, debuting as part of its first generation of VTubers alongside Yozora Mel, Aki Rosenthal, Natsuiro Matsuri and Akai Haato. She is also part of a unit inside hololive called hololive Gamers (ホロライブゲーマーズ) alongside Ookami Mio, Nekomata Okayu and Inugami Korone.",
            //Natsuiro Matsuri
            "Natsuiro Matsuri (夏色まつり) is a female Japanese Virtual YouTuber associated with hololive, debuting as part of its first generation of VTubers alongside Yozora Mel, Aki Rosenthal, Shirakami Fubuki and Akai Haato.",
            //Aki Rosenthal
            "Aki Rosenthal (アキ・ローゼンタール) is a female Japanese Virtual YouTuber associated with hololive, debuting as part of its first generation of VTubers alongside Yozora Mel, Natsuiro Matsuri, Shirakami Fubuki and Akai Haato.",
            //Akai Hato
            "Akai Haato (赤井はあと), also known by her Haachama (はあちゃま) personality, is a female Japanese Virtual YouTuber associated with hololive, debuting as part of its first generation of VTubers alongside Yozora Mel, Aki Rosenthal, Natsuiro Matsuri, and Shirakami Fubuki."
    };

    private static final String[] talentNickName = {
            //Tokino Sora
            "The Goddess of hololive \n Tokki~ (とっきー) \n〇〇's Sora (〇〇のそら) \nSora-chan",
            //Roboco-san
            "Roboco-san\n" + "Cutting-edge Robot",
            //Sakura Miko
            "Miko-chi\n" + "Elite Miko\n" + "sakuramiko35 (usual in-game username)\n" + "Mikomiko (by Inugami Korone)",
            //Hoshimachi Suisei
            "Sui-chan\n" + "Suisui\n" + "Suicopath\n" + "Meteor (male persona)",
            //AZki
            "Virtual Diva AZKi better known simply as AZKi is a female Japanese Virtual YouTuber and singer. Her concept was conceived by hololive's parent company: COVER Corporation and her design and videos are produced by Composition Inc. While she debuted alone, she is currently part of \"hololive 0th gen\" alongside fellow solo debutants: Tokino Sora, Roboco, Sakura Miko and Hoshimachi Suisei.",
            //Yozora Mel
            "Merumeru\n" + "Kureiji Mel\n" + "BANPire",
            //Shirakami Fubuki
            "Buki, Fubuki-chan, FBK,\n" + "Kurokami Fubuki,\n" + "Byakko, Nazo Nazo Kamen,\n" + "Fox Burger, Fubuking,\n" + "Yukkuri Fubuki,\n" + "Friend, Waifriend",
            //Natsuiro Matsuri
            "Matsurin\n" + "Matsuricha-senpai (by Himemori Luna)\n" + "GOD",
            //Aki Rosenthal
            "AkiRose\n" + "Akipella\n" + "MukiRose",
            //Akai Hato
            "Haachama (はあちゃま)\n" + "Red-kun (male persona)"
    };

    private static final String[] talentDebut = {
            //Tokino Sora
            "YouTube: 2017/09/07 \nNiconico: 2017/09/07",
            //Roboco-san
            "YouTube: 2018/03/04\n" + "Niconico: 2018/04/29",
            //Sakura Miko
            "YouTube: 2018/08/01\n" + "Niconico: 2019/02/27\n" + "bilibili: 2019/05/07\n" + "Twitch:2020/12/02",
            //Hoshimachi Suisei
            "YouTube: 2018/03/22",
            //AZki
            "YouTube: 2018/11/15",
            //Yozora Mel
            "YouTube: 2018/05/13",
            //Shirakami Fubuki
            "YouTube: 2018/06/01",
            //Natsuiro Matsuri
            "YouTube: 2018/06/01",
            //Aki Rosenthal
            "YouTube: 2018/06/07\n" + "Mirrativ: 2018/06/01\n" + "TwitCasting: 2018/06/04\n" + "OPENREC.tv: 2018/06/12\n" + "bilibili: 2019/05/03",
            //Akai Hato
            "YouTube: 2018/06/02\n" + "OPENREC.tv: 2018/08/12\n" + "Niconico: 2018/09/14\n" + "bilibili: 2019/01/28"
    };

    private static final String[] talentAffiliation = {
            //Tokino Sora
            "hololive JP",
            //Roboco-san
            "hololive JP",
            //Sakura Miko
            "hololive JP",
            //Hoshimachi Suisei
            "hololive JP",
            //AZki
            "hololive (INoNaKa MUSIC)\n" + "Participating project: upd8",
            //Yozora Mel
            "hololive JP",
            //Shirakami Fubuki
            "hololive JP",
            //Natsuiro Matsuri
            "hololive JP",
            //Aki Rosenthal
            "hololive JP",
            //Akai Hato
            "hololive JP"

    };

    private static final String[] talentBirthday = {
            //Tokino Sora
            "15 May",
            //Roboco-san
            "23 May",
            //Sakura Miko
            "5 March",
            //Hoshimachi Suisei
            "22 March",
            //AZki
            "1 July",
            //Yozora Mel
            "31 October",
            //Shirakami Fubuki
            "5 October",
            //Natsuiro Matsuri
            "22 July",
            //Aki Rosenthal
            "17 February",
            //Akai Hato
            "10 August"
    };

    private static final String[] talentFanbase = {
            //Tokino Sora
            "Sora-tomo",
            //Roboco-san
            "Robosa",
            //Sakura Miko
            "\"35P\" (みこぴー Mikopi)",
            //Hoshimachi Suisei
            "Stargazers",
            //AZki
            "Pioneer",
            //Yozora Mel
            "Kapu-min",
            //Shirakami Fubuki
            "Sukon-bu",
            //Natsuiro Matsuri
            "Matsurisu",
            //Aki Rosenthal
            "Squad Rose",
            //Akai Hato
            "Haaton"
    };

    private static final String[] talentIllustrator = {
            //Tokino Sora
            "ordan",
            //Roboco-san
            "kuromaru9",
            //Sakura Miko
            "kuromaru9",
            //Hoshimachi Suisei
            "Teshima Nari",
            //AZki
            "kasokuSato",
            //Yozora Mel
            "Ayami",
            //Shirakami Fubuki
            "Nagishiro Mito",
            //Natsuiro Matsuri
            "Minamura Haruki",
            //Aki Rosenthal
            "Azumi Akitake",
            //Akai Hato
            "HaruYuki"
    };

    private static final int[] talentHeight = {
            //Tokino Sora
            160,
            //Roboco-san
            154,
            //Sakura Miko
            152,
            //Hoshimachi Suisei
            160,
            //AZki
            168,
            //Yozora Mel
            154,
            //Shirakami Fubuki
            155,
            //Natsuiro Matsuri
            152,
            //Aki Rosenthal
            162,
            //Akai Hato
            154
    };

    private static final String[] talentChannel= {
            //Tokino Sora
            "https://www.youtube.com/channel/UCp6993wxpyDPHUpavwDFqgg",
            //Roboco-san
            "https://www.youtube.com/channel/UCDqI2jOz0weumE8s7paEk6g",
            //Sakura Miko
            "https://www.youtube.com/channel/UC-hM6YJuNYVAmUWxeIr9FeA",
            //Hoshimachi Suisei
            "https://www.youtube.com/channel/UC5CwaMl1eIgY8h02uZw7u8A",
            //AZki
            "https://www.youtube.com/channel/UC0TXe_LYZ4scaW2XMyi5_kw",
            //Yozora Mel
            "https://www.youtube.com/channel/UCD8HOxPs4Xvsm8H0ZxXGiBw",
            //Shirakami Fubuki
            "https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg",
            //Natsuiro Matsuri
            "https://www.youtube.com/channel/UCQ0UDLQCjY0rmuxCDE38FGg",
            //Aki Rosenthal
            "https://www.youtube.com/channel/UCFTLzh12_nrtzqBPsTCqenA",
            //Akai Hato
            "https://www.youtube.com/channel/UC1CfXB_kRs3C-zaeTG3oGyg"
    };

    private static final String[] talentWebio = {
            //Tokino Sora
            "https://virtualyoutuber.fandom.com/wiki/Tokino_Sora",
            //Roboco-san
            "https://virtualyoutuber.fandom.com/wiki/Roboco",
            //Sakura Miko
            "https://virtualyoutuber.fandom.com/wiki/Sakura_Miko",
            //Hoshimachi Suisei
            "https://virtualyoutuber.fandom.com/wiki/Hoshimachi_Suisei",
            //AZki
            "https://virtualyoutuber.fandom.com/wiki/AZKi",
            //Yozora Mel
            "https://virtualyoutuber.fandom.com/wiki/Yozora_Mel",
            //Shirakami Fubuki
            "https://virtualyoutuber.fandom.com/wiki/Shirakami_Fubuki",
            //Natsuiro Matsuri
            "https://virtualyoutuber.fandom.com/wiki/Natsuiro_Matsuri",
            //Aki Rosenthal
            "https://virtualyoutuber.fandom.com/wiki/Aki_Rosenthal",
            //Akai Hato
            "https://virtualyoutuber.fandom.com/wiki/Akai_Haato"
    };

    private static final String[] talentTwitter = {
            //Tokino Sora
            "https://twitter.com/tokino_sora",
            //Roboco-san
            "https://twitter.com/robocosan",
            //Sakura Miko
            "https://twitter.com/sakuramiko35",
            //Hoshimachi Suisei
            "https://twitter.com/suisei_hosimati",
            //AZki
            "https://twitter.com/AZKi_VDiVA",
            //Yozora Mel
            "https://twitter.com/yozoramel",
            //Shirakami Fubuki
            "https://twitter.com/shirakamifubuki",
            //Natsuiro Matsuri
            "https://twitter.com/natsuiromatsuri",
            //Aki Rosenthal
            "https://twitter.com/akirosenthal",
            //Akai Hato
            "https://twitter.com/akaihaato"
    };

    private static int[] talentPhoto= {
            R.drawable.tokino_sora,
            R.drawable.roboco,
            R.drawable.sakura_miko,
            R.drawable.hoshimachi_suisei,
            R.drawable.azki,
            R.drawable.yozora_mel,
            R.drawable.shirakami_fubuki,
            R.drawable.natsuiro_matsuri,
            R.drawable.aki_rosenthal,
            R.drawable.akai_haato
    };

    static ArrayList<Talent> getListData(){
      ArrayList<Talent> list = new ArrayList<>();
      for (int position = 0; position < talentNames.length; position++){
          Talent talent = new Talent();
          talent.setName(talentNames[position]);
          talent.setHololive(hololiveGen[position]);
          talent.setQuotes(talentQuotes[position]);
          talent.setDesc(talentDesc[position]);
          talent.setDebute(talentDebut[position]);
          talent.setPhoto(talentPhoto[position]);
          talent.setAffiliation(talentAffiliation[position]);
          talent.setHeight(talentHeight[position]);
          talent.setFanbase(talentFanbase[position]);
          talent.setIllustrator(talentIllustrator[position]);
          talent.setNickName(talentNickName[position]);
          talent.setBirthday(talentBirthday[position]);
          talent.setTalentChannel(talentChannel[position]);
          talent.setTalentWebio(talentWebio[position]);
          talent.setTalentTwitter(talentTwitter[position]);

          list.add(talent);
      }
      return list;
    };
}

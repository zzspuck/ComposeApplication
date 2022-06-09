package com.example.composeapplication

/**
 * @author: zzs
 * @date: 2022/6/10
 */
object SampleData {

    fun conversationSample():List<Message>{
        val mutableListOf = mutableListOf<Message>()
        mutableListOf.add(Message("大头", "是建档立卡dfjklsdajflksdjflksjdlfsdfsdfsdf"))
        mutableListOf.add(Message("大头", "是建档立卡sdf;ladjfjksldafjlsdkjflskdjflksdjfk"))
        mutableListOf.add(Message("大头", "是建档立卡fsjdklfjlskdjflksd"))
        mutableListOf.add(Message("大头", "是建档立卡dsjfksldjfl"))
        mutableListOf.add(Message("大头", "是建档立卡fjsdkljflsd"))
        mutableListOf.add(Message("大头", "是建档立卡fsdkfjklsd"))
        mutableListOf.add(Message("大头", "是建档立卡sdjfklsdk"))
        mutableListOf.add(Message("大头", "是建档立卡fsdjkfjlsd"))
        mutableListOf.add(Message("大头", "是建档立卡sjdfklsdl"))
        return mutableListOf
    }
}
package cn.czfshine.wechat.msg;

import cn.czfshine.wechat.database.DatabaseDamagedException;
import cn.czfshine.wechat.database.pojo.MessageDO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author:czfshine
 * @date:18-2-21
 **/
public class UnknowMessage extends BaseMessage {

    UnknowMessage(MessageDO rs) throws SQLException, DatabaseDamagedException {
        super(rs);
    }
}

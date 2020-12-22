package com.example.frameworkstudy.common.session;




import com.store.tianmao.exception.SessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * session工厂
 *
 * @author liuqiang
 */
@Component("sessionFactroy")
public class SessionFactroy {
    @Autowired
    private Session session;
    public Session createSession() throws SessionException {
        if(session == null) {
            throw new SessionException("session为空，请检查配置");
        }
        return session;
    }
}

package saberapplications.pawpads.events;

import com.quickblox.users.model.QBUser;


public class FriendRemovedEvent {

    QBUser user;

    public FriendRemovedEvent(QBUser user) {
        this.user = user;
    }

    public QBUser getUser() {
        return user;
    }
}

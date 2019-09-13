package pojo;

import java.io.Serializable;

public class TStudent implements Serializable {
    private int id2;
    private String cname;
    private int selfcardNo;
    private String note;
    private TStudentSelfCard tStudentSelfCard;

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(int selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TStudentSelfCard gettStudentSelfCard() {
        return tStudentSelfCard;
    }

    public void settStudentSelfCard(TStudentSelfCard tStudentSelfCard) {
        this.tStudentSelfCard = tStudentSelfCard;
    }
}

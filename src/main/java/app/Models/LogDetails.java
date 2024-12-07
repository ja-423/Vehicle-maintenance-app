package app.Models;

public class LogDetails {
    private Date UploadDate;
    private Date EditDate;
    private String RecordName;
    private String RecordDescription;

    public int getUploadDate() {
        return UploadDate;
    }

    public int getEditDate() {
        return EditDate;
    }

    public int getRecordName() {
        return RecordName;
    }

    public int getRecordDescription() {
        return RecordDescription;
    }

    public void setUploadDate(Date UploadDate) {
        this.UploadDate = UploadDate;
    }

    public void setEditDate(Date EditDate) {
        this.EditDate = EditDate;
    }

    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    public void setRecordDescription(String RecordDescription) {
        this.RecordDescription = RecordDescription;
    }
}

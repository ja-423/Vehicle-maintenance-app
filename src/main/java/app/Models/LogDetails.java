package app.Models;

public class LogDetails {
    private String UploadDate;
    private String EditDate;
    private String RecordName;
    private String RecordDescription;
    
    public LogDetails(String uploadDate, String editDate, String recordName, String recordDescription) {

        this.UploadDate = uploadDate;
        this.EditDate = editDate;
        this.RecordName = recordName;
        this.RecordDescription = recordDescription;
    }

    public String getUploadDate() {
        return UploadDate;
    }

    public String getEditDate() {
        return EditDate;
    }

    public String getRecordName() {
        return RecordName;
    }

    public String getRecordDescription() {
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

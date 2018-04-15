package ie.marcosmiranda.demo.pbowes.jsonreader.bean;

public class ErrorFile {
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private String errorMsg = "There is a problem loading the JSON File," +
            " please, check the file configured";
}

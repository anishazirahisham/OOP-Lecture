public class Address {
    private String addrNum, addrArea, addrPosscode, addrDistrict, addrState;
    private String addrFull;
    

    public Address(String addrFull){
        String[] address = addrFull.split(", ");
        this.addrFull = addrFull;
        addrNum = address[0];
        addrArea = address[1];
        addrPosscode = address[2];
        addrDistrict = address[3];
        addrState = address[4];
    }

    public String getFullAddress(){
        return addrFull;
    }

    public String getNum() {
        return addrNum;
    }

    public String getArea(){
        return addrArea;
    }

    public String getPosscode(){
        return addrPosscode;
    }

    public String getDistrict(){
        return addrDistrict;
    }

    public String getState(){
        return addrState;
    }


    public void setAddrNum(String addrNum) {
        this.addrNum = addrNum;
    }

    public void setAddrArea(String addrArea){
        this.addrArea = addrArea;
    }

    public void setAddrPosscode(String addrPosscode){
        this.addrPosscode = addrPosscode;
    }

    public void setAddrDistrict(String addrDistrict){
        this.addrDistrict = addrDistrict;
    }

    public void setAddrState(String addrState){
        this.addrState = addrState;
    }
}

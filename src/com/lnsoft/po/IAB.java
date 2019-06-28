package com.lnsoft.po;

public class IAB {
    private String objid;

    private String zsAaa;

    private String szBbb;

    private String xcCcc;

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid == null ? null : objid.trim();
    }

    public String getZsAaa() {
        return zsAaa;
    }

    public void setZsAaa(String zsAaa) {
        this.zsAaa = zsAaa == null ? null : zsAaa.trim();
    }

    public String getSzBbb() {
        return szBbb;
    }

    public void setSzBbb(String szBbb) {
        this.szBbb = szBbb == null ? null : szBbb.trim();
    }

    public String getXcCcc() {
        return xcCcc;
    }

    public void setXcCcc(String xcCcc) {
        this.xcCcc = xcCcc == null ? null : xcCcc.trim();
    }
}
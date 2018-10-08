package com.medimpact.profile.bean;

/**
 * 
 * @author mohankumara_n
 *
 */
public class OtherAllergies {
	
	private boolean aspirin;
	private boolean cephalosporins;
	private boolean codeine;
	private boolean erythromycin;
	private boolean nsaids;
	private boolean penicillin;
	private boolean quinolones;
	private boolean sulfa;
	private boolean tetracyclines;
	private boolean none;
	private String addOtherAllergiesDesc;
	
	public boolean isAspirin() {
		return aspirin;
	}
	public void setAspirin(boolean aspirin) {
		this.aspirin = aspirin;
	}
	public boolean isCephalosporins() {
		return cephalosporins;
	}
	public void setCephalosporins(boolean cephalosporins) {
		this.cephalosporins = cephalosporins;
	}
	public boolean isCodeine() {
		return codeine;
	}
	public void setCodeine(boolean codeine) {
		this.codeine = codeine;
	}
	public boolean isErythromycin() {
		return erythromycin;
	}
	public void setErythromycin(boolean erythromycin) {
		this.erythromycin = erythromycin;
	}
	public boolean isNsaids() {
		return nsaids;
	}
	public void setNsaids(boolean nsaids) {
		this.nsaids = nsaids;
	}
	public boolean isPenicillin() {
		return penicillin;
	}
	public void setPenicillin(boolean penicillin) {
		this.penicillin = penicillin;
	}
	public boolean isQuinolones() {
		return quinolones;
	}
	public void setQuinolones(boolean quinolones) {
		this.quinolones = quinolones;
	}
	public boolean isSulfa() {
		return sulfa;
	}
	public void setSulfa(boolean sulfa) {
		this.sulfa = sulfa;
	}
	public boolean isTetracyclines() {
		return tetracyclines;
	}
	public void setTetracyclines(boolean tetracyclines) {
		this.tetracyclines = tetracyclines;
	}
	public boolean isNone() {
		return none;
	}
	public void setNone(boolean none) {
		this.none = none;
	}
	public String getAddOtherAllergiesDesc() {
		return addOtherAllergiesDesc;
	}
	public void setAddOtherAllergiesDesc(String addOtherAllergiesDesc) {
		this.addOtherAllergiesDesc = addOtherAllergiesDesc;
	}	
}

package com.medimpact.profile.information.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medimpact.profile.bean.Allergies;
import com.medimpact.profile.bean.BenefitCard;
import com.medimpact.profile.bean.HealthConditions;
import com.medimpact.profile.bean.MedicalInformation;
import com.medimpact.profile.bean.MemberAddress;
import com.medimpact.profile.bean.OtherAllergies;
import com.medimpact.profile.bean.OtherHealthConditions;
import com.medimpact.profile.bean.Phone;
import com.medimpact.profile.bean.Profile;
import com.medimpact.profile.bean.Vacation;
import com.medimpact.profile.exception.ResourceNotFoundException;

/**
 * 
 * @author chengalvarayan_m
 *
 */
@SpringBootApplication
@RestController
public class MemberProfileDetailsController {

	Map<Long,Profile> memberMap=new HashMap<>();
	Map<Long,MedicalInformation> medicalInformationMap=new HashMap<>();
	Profile profile;
	List<MemberAddress> memberAddressList;
	List<String> listOfAddressTypes;
	List<Phone> phoneList;
	private String pattern = "MMM dd, yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	public static void main(String[] args) {
		SpringApplication.run(MemberProfileDetailsController.class, args);
	}

	public MemberProfileDetailsController() {

		/**
		 * Set Member Profile
		 */
		profile=new Profile();
		phoneList=new ArrayList<>();
		listOfAddressTypes=new ArrayList<>();
		listOfAddressTypes.add("Home");
		listOfAddressTypes.add("Vacation");
		listOfAddressTypes.add("Other");
		String dateOfBirth=simpleDateFormat.format(new Date());
		profile.setMemberId(new Long("12345678"));
		profile.setMemberName("Stephanie Smith");
		profile.setMemberRelationship("PRIMARY");
		profile.setMemberInsuredNo(1234568);
		profile.setLanguage("English");
		profile.setDateOfBirth(dateOfBirth);
		profile.setEmail("ABC@Rock.com");

		MemberAddress memberAddress=new MemberAddress();
		memberAddress.setId(new Long(1));
		memberAddress.setDoorNo(1234);
		memberAddress.setStreet("SOUTH STREET MIRA MESA BLVD");
		memberAddress.setCity("SAN DIEGO");
		memberAddress.setState("CA");
		memberAddress.setPinCode(92131);
		memberAddress.setPrimary(true);
		memberAddress.setType("Home");
		memberAddressList=new ArrayList<>();
		memberAddressList.add(memberAddress);

		memberAddress=new MemberAddress();
		memberAddress.setId(new Long(2));
		memberAddress.setDoorNo(5678);
		memberAddress.setStreet("NORTH STREET MIRA MESA BLVD");
		memberAddress.setCity("SAN DIEGO2");
		memberAddress.setState("CA2");
		memberAddress.setPinCode(93131);
		memberAddress.setPrimary(false);
		memberAddress.setType("Vacation");
		Vacation vacation=new Vacation();
		String fromDate=simpleDateFormat.format(new Date());
		String toDate=simpleDateFormat.format(new Date());
		vacation.setFromDate(fromDate);
		vacation.setToDate(toDate);
		memberAddress.setVacationDate(vacation);
		memberAddressList.add(memberAddress);

		memberAddress=new MemberAddress();
		memberAddress.setId(new Long(3));
		memberAddress.setDoorNo(5678);
		memberAddress.setStreet("NORTH STREET MIRA MESA BLVD");
		memberAddress.setCity("SAN DIEGO2");
		memberAddress.setState("CA2");
		memberAddress.setPinCode(93131);
		memberAddress.setPrimary(false);
		memberAddress.setType("Other");
		memberAddressList.add(memberAddress);
		Phone phone=new Phone();
		phone.setId(new Long(1));
		phone.setPhoneNo("858-621-6130");
		phone.setPrimary(true);
		phoneList.add(phone);

		phone=new Phone();
		phone.setId(new Long(2));
		phone.setPhoneNo("858-621-5120");
		phone.setPrimary(false);
		phoneList.add(phone);

		profile.setAddresses(memberAddressList);
		profile.setPhones(phoneList);

		BenefitCard benefitCard=new BenefitCard();
		benefitCard.setBenefitCardId("55410ZZZHEBMB1-0");
		benefitCard.setBenefitHealthPlan("ABC HEALTH PLAN");
		benefitCard.setMemberName(profile.getMemberName());
		benefitCard.setRxGrp("ZZZDED1");
		benefitCard.setRxBin("003585");
		benefitCard.setRxPcn("55410");

		profile.setBenefitCard(benefitCard);
		profile.setListOfAddressTypes(listOfAddressTypes);
		memberMap.put(new Long("12345678"), profile);

		/**
		 * Set Medical Information
		 */
		MedicalInformation medicalInformation = new MedicalInformation();

		medicalInformation.setMemberNumber(profile.getMemberId());
		
		Allergies allergies = new Allergies();
		List<Allergies> allergiesList = new ArrayList<>();
		allergies.setAspirin(false);
		allergies.setCephalosporins(false);
		allergies.setCodeine(false);
		allergies.setErythromycin(false);
		allergies.setNsaids(false);
		allergies.setPenicillin(false);
		allergies.setQuinolones(false);
		allergies.setSulfa(false);
		allergies.setTetracyclines(false);
		allergies.setNone(false);
		allergiesList.add(allergies);
		medicalInformation.setAllergies(allergiesList);

		OtherAllergies otherAllergies = new OtherAllergies();
		List<OtherAllergies> otherAllergiesList = new ArrayList<>();
		otherAllergies.setAspirin(false);
		otherAllergies.setCephalosporins(false);
		otherAllergies.setCodeine(false);
		otherAllergies.setErythromycin(false);
		otherAllergies.setNsaids(false);
		otherAllergies.setPenicillin(false);
		otherAllergies.setQuinolones(false);
		otherAllergies.setSulfa(false);
		otherAllergies.setTetracyclines(false);
		otherAllergies.setNone(false);
		otherAllergies.setAddOtherAllergiesDesc("Lipitor,Lipsum, Dolor,Sit, Amet");
		otherAllergiesList.add(otherAllergies);
		medicalInformation.setOtherAllergies(otherAllergiesList);

		HealthConditions healthConditions = new HealthConditions();
		List<HealthConditions> healthConditionsList = new ArrayList<>();
		healthConditions.setAsthma(false);
		healthConditions.setCholesterol(false);
		healthConditions.setCopd(false);
		healthConditions.setDiabetes(false);
		healthConditions.setGlaucoma(false);
		healthConditions.setHeart(false);
		healthConditions.setHypertension(false);
		healthConditions.setKidney(false);
		healthConditions.setStroke(false);
		healthConditions.setThyroid(false);
		healthConditionsList.add(healthConditions);
		medicalInformation.setHealthConditions(healthConditionsList);

		OtherHealthConditions otherHealthConditions = new OtherHealthConditions();
		List<OtherHealthConditions> otherHealthConditionsList = new ArrayList<>();
		otherHealthConditions.setAsthma(false);
		otherHealthConditions.setCholesterol(false);
		otherHealthConditions.setCopd(false);
		otherHealthConditions.setDiabetes(false);
		otherHealthConditions.setGlaucoma(false);
		otherHealthConditions.setHeart(false);
		otherHealthConditions.setHypertension(false);
		otherHealthConditions.setKidney(false);
		otherHealthConditions.setStroke(false);
		otherHealthConditions.setThyroid(false);
		otherHealthConditions.setAddOtherHealthConditionsDesc("Lipitor,Lipsum, Dolor,Sit, Amet");
		otherHealthConditionsList.add(otherHealthConditions);
		medicalInformation.setOtherHealthConditions(otherHealthConditionsList);

		medicalInformationMap.put(profile.getMemberId(), medicalInformation);
	}

	/**
	 * Read a Profile
	 * @param id
	 * @return
	 */
	@GetMapping("/member/{id}")
	public Profile findByMemberId(@PathVariable("id") Long id) {
		Profile profile = memberMap.get(id);
		if(null != profile)
			return profile;
		else
			throw new ResourceNotFoundException("Member", "id", id);
	}

	/**
	 * Create a Profile
	 * @param profile
	 * @return
	 */
	@PostMapping("/member")
	public Profile createMemberProfile(@Valid @RequestBody Profile profile) {
		memberMap.put(profile.getMemberId(), profile);
		return profile;
	}

	/**
	 * Update Profile Details
	 * @param id
	 * @param profileInfo
	 * @return
	 */
	@PutMapping("/member/{id}")
	public Profile updateMemberProfile(@PathVariable("id") Long id, @Valid @RequestBody Profile profileInfo) {

		Profile profile = memberMap.get(id);
		if(null != profile) {
			if(null != profileInfo) {
				profile.setMemberRelationship(profileInfo.getMemberRelationship());
				profile.setMemberInsuredNo(profileInfo.getMemberInsuredNo());
				profile.setMemberName(profileInfo.getMemberName());
				profile.setLanguage(profileInfo.getLanguage());
				List<MemberAddress> addressList = profileInfo.getAddresses();
				List<Phone> phoneList=profileInfo.getPhones();
				if(null !=addressList) 
					profile.setAddresses(addressList);
				if(null !=phoneList)
					profile.setPhones(phoneList);
			}
		}
		else
			throw new ResourceNotFoundException("Member", "id", id);
		return profile;		
	}

	/**
	 * Delete a Profile
	 * @param id
	 * @return
	 */
	@DeleteMapping("/member/{id}")
	public ResponseEntity<?> deleteAccount(@PathVariable(value = "id") Long id) {
		Profile profile=memberMap.get(id);
		if(null !=profile)
			memberMap.remove(id);
		else
			throw new ResourceNotFoundException("Member", "id", id);

		return ResponseEntity.ok().build();
	}

	/**
	 * Read a Medical Information
	 * @param id
	 * @return
	 */
	@GetMapping("/medical-information/{id}")
	public MedicalInformation getMemberInformation(@PathVariable("id") Long id) {
		MedicalInformation medicalInformation = medicalInformationMap.get(id);
		if(null != medicalInformation)
			return medicalInformation;
		else
			throw new ResourceNotFoundException("Member", "id", id);
	}

	/**
	 * Create a Medical Information
	 * @param medicalInformation
	 * @return
	 */
	@PostMapping("/medical-information")
	public MedicalInformation createMedicalInformation(@Valid @RequestBody MedicalInformation medicalInformation) {
		medicalInformationMap.put(medicalInformation.getMemberNumber(), medicalInformation);
		return medicalInformation;
	}

	/**
	 * Update Medical Information
	 * @param id
	 * @param information
	 * @return
	 */
	@PutMapping("/medical-information/{id}")
	public MedicalInformation updateMedicalInformation(@PathVariable("id") Long id, @Valid @RequestBody MedicalInformation information) {
		MedicalInformation medicalInformation = medicalInformationMap.get(id);
		if(null != medicalInformation) {
			medicalInformationMap.put(id, information);
			medicalInformation = medicalInformationMap.get(id);
			return medicalInformation;
		}
		else
			throw new ResourceNotFoundException("Member", "id", id);
	}

	/**
	 * Delete a Medical Information
	 * @param id
	 * @return
	 */
	@DeleteMapping("/medical-information/{id}")
	public ResponseEntity<?> deleteMedicalInformation(@PathVariable(value = "id") Long id) {
		MedicalInformation medicalInformation =medicalInformationMap.get(id);
		if(null !=medicalInformation)
			medicalInformationMap.remove(id);
		else
			throw new ResourceNotFoundException("Member", "id", id);

		return ResponseEntity.ok().build();
	}
}

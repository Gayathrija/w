// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import ktc_scs_schema.proxies.TC5429_KNTRLL03DS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5429 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5429(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5429_KNTRLL03DS msg = new TC5429_KNTRLL03DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setKNRREF(msgClass.getMessageString(12));
			msg.setKNKRTN(msgClass.getMessageNumber(19,0));
			msg.setKNSTAN(msgClass.getMessageNumber(6,0));
			msg.setKNAUTP(msgClass.getMessageNumber(1,0));
			msg.setKNDTTM(msgClass.getMessageNumber(14,0));
			msg.setWDAUTP(msgClass.getMessageString(25));
			msg.setKNKNTN(msgClass.getMessageNumber(19,0));
			msg.setWDDESC(msgClass.getMessageString(25));
			msg.setKNBELS(msgClass.getMessageNumber(15,2));
			msg.setKNBELB(msgClass.getMessageNumber(15,2));
			msg.setKNBELI(msgClass.getMessageNumber(15,2));
			msg.setKNCCDS(msgClass.getMessageString(3));
			msg.setKNCCDB(msgClass.getMessageString(3));
			msg.setADCCDE(msgClass.getMessageString(3));
			msg.setKNBXAM(msgClass.getMessageNumber(15,2));
			msg.setWDAPDT(msgClass.getMessageNumber(8,0));
			msg.setWDAPTM(msgClass.getMessageNumber(6,0));
			msg.setWDSDT1(msgClass.getMessageNumber(8,0));
			msg.setWDSTM1(msgClass.getMessageNumber(6,0));
			msg.setWDRVDT(msgClass.getMessageNumber(8,0));
			msg.setWDRVTM(msgClass.getMessageNumber(6,0));
			msg.setKNCNDT(msgClass.getMessageNumber(8,0));
			msg.setWDARJC(msgClass.getMessageString(4));
			msg.setWDRJDS(msgClass.getMessageString(25));
			msg.setKNIDRF(msgClass.getMessageString(15));
			msg.setKNFID(msgClass.getMessageNumber(11,0));
			msg.setKNMCC(msgClass.getMessageString(4));
			msg.setKNBKID(msgClass.getMessageNumber(11,0));
			msg.setBKBPNM(msgClass.getMessageString(40));
			msg.setKNMEAC(msgClass.getMessageNumber(5,0));
			msg.setKNCATI(msgClass.getMessageString(8));
			msg.setKNCANM(msgClass.getMessageString(40));
			msg.setKNALIN(msgClass.getMessageString(1));
			msg.setWDALRS(msgClass.getMessageString(12));
			msg.setKNRVWD(msgClass.getMessageNumber(8,0));
			msg.setKNDOMI(msgClass.getMessageString(1));
			msg.setWDDOMI(msgClass.getMessageString(1));
			msg.setKNUSER(msgClass.getMessageString(10));
			msg.setKNGTDT(msgClass.getMessageNumber(6,0));
			msg.setKNRKID(msgClass.getMessageString(6));
			msg.setKNKNTR(msgClass.getMessageString(6));
			msg.setKNASTS(msgClass.getMessageNumber(3,0, true));
			msg.setKNASRC(msgClass.getMessageString(1));
			msg.setKNSAFW(msgClass.getMessageString(1));
			msg.setWDSAFW(msgClass.getMessageString(1));
			msg.setKNAVRC(msgClass.getMessageString(3));
			msg.setKNSOVR(msgClass.getMessageString(1));
			msg.setWDSOVR(msgClass.getMessageString(1));
			msg.setKNAUTG(msgClass.getMessageString(3));
			msg.setKNTCGR(msgClass.getMessageString(3));
			msg.setKNRESP(msgClass.getMessageString(2));
			msg.setKNVLCD(msgClass.getMessageString(4));
			msg.setWDBALI(msgClass.getMessageString(1));
			msg.setKNPOSM(msgClass.getMessageString(2));
			msg.setKNPOSD(msgClass.getMessageString(2));
			msg.setKEAVST(msgClass.getMessageNumber(3,0, true));
			msg.setKEBCDE(msgClass.getMessageString(3));
			msg.setKEKNST(msgClass.getMessageNumber(3,0, true));
			msg.setKESPKD(msgClass.getMessageNumber(1,0));
			msg.setKESPRK(msgClass.getMessageString(2));
			msg.setKEBKRD(msgClass.getMessageNumber(11,0));
			msg.setKECSLD(msgClass.getMessageNumber(15,2));
			msg.setKEPRBO(msgClass.getMessageNumber(15,2));
			msg.setKESUBA(msgClass.getMessageNumber(15,2));
			msg.setKEGRPA(msgClass.getMessageNumber(15,2));
			msg.setKESGAV(msgClass.getMessageNumber(15,2));
			msg.setKETSLD(msgClass.getMessageNumber(15,2));
			msg.setKERMK1(msgClass.getMessageString(25));
			msg.setKERMK2(msgClass.getMessageString(25));
			msg.setKERMK3(msgClass.getMessageString(25));
			msg.setKERMK4(msgClass.getMessageString(25));
			msg.setKERMK5(msgClass.getMessageString(25));
			msg.setKERMK6(msgClass.getMessageString(25));
			msg.setKEAPBY(msgClass.getMessageString(15));
			msg.setKEUCIA(msgClass.getMessageNumber(15,2));
			msg.setKNPRCD(msgClass.getMessageString(6));
			msg.setKNSDTM(msgClass.getMessageNumber(14,0));
			msg.setKNRSDT(msgClass.getMessageNumber(14,0));
			msg.setKNALRS(msgClass.getMessageString(40));
			msg.setTPGRTP(msgClass.getMessageNumber(2,0));
			msg.setWDECI(msgClass.getMessageString(3));
			msg.setAJCVCD(msgClass.getMessageString(1));
			msg.setKNFBIN(msgClass.getMessageString(1));
			msg.setSRNETW(msgClass.getMessageString(3));
			msg.setKNPOSA(msgClass.getMessageString(19));
			msg.setTKTPAN(msgClass.getMessageNumber(19, 0));
			msg.setTKTKTP(msgClass.getMessageString(2));
			msg.setTKMTYP(msgClass.getMessageString(2));
			msg.setKNQRPI(msgClass.getMessageString(3));
			msg.setKNMPAN(msgClass.getMessageNumber(19, 0));
			msg.setKNQRIN(msgClass.getMessageString(1));
			msg.setWDDEVC(msgClass.getMessageString(5));   // Wallet Name
			
			msg.setResponseCode("OK");
			msg.setResponseDescription("Successfully.");
		}
		catch (Exception ex)
		{
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
		}
		
		return msg.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetTC5429";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
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
import ktc_scs_schema.proxies.TC5417_TRANSR14DS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5417 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5417(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5417_TRANSR14DS msg = new TC5417_TRANSR14DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setTRBNTN(msgClass.getMessageNumber(9,0, true));
			msg.setTRBLON(msgClass.getMessageNumber(7,0, true));
			msg.setTRTTYP(msgClass.getMessageNumber(4,0, true));
			msg.setTRKRTN(msgClass.getMessageNumber(19,0));
			msg.setTRRKID(msgClass.getMessageString(6));
			msg.setTRTRDT(msgClass.getMessageNumber(8,0));
			msg.setTRBDAT(msgClass.getMessageNumber(8,0));
			msg.setTRVLDT(msgClass.getMessageNumber(8,0));
			msg.setTRFADT(msgClass.getMessageNumber(8,0));
			msg.setTRACQN(msgClass.getMessageNumber(23,0, true));
			msg.setTRBELS(msgClass.getMessageNumber(15,2));
			msg.setTRCCDS(msgClass.getMessageString(3));
			msg.setTRBELB(msgClass.getMessageNumber(15,2));
			msg.setTRCCDB(msgClass.getMessageString(3));
			msg.setTRBEL(msgClass.getMessageNumber(15,2));
			msg.setTRCCDE(msgClass.getMessageString(3));
			msg.setTRBELR(msgClass.getMessageNumber(15,2));
			msg.setTRCCDR(msgClass.getMessageString(3));
			msg.setTRREF(msgClass.getMessageString(15));
			msg.setTRREFN(msgClass.getMessageString(15));
			msg.setTRMCC(msgClass.getMessageString(4));
			msg.setTRBKID(msgClass.getMessageNumber(11,0));
			msg.setBKBPNM(msgClass.getMessageString(40));
			msg.setTRCANM(msgClass.getMessageString(40));
			msg.setTRADES(msgClass.getMessageString(50));
			msg.setBNUSER(msgClass.getMessageString(10));
			msg.setWDDATE(msgClass.getMessageNumber(8,0));
			msg.setWDTIME(msgClass.getMessageNumber(6,0));
			msg.setTRUBNT(msgClass.getMessageNumber(9,0, true));
			msg.setTRUBLO(msgClass.getMessageNumber(7,0, true));
			msg.setTRTMBT(msgClass.getMessageString(8));
			msg.setTRUTBN(msgClass.getMessageNumber(9,0));
			msg.setTRUTBL(msgClass.getMessageNumber(7,0));
			msg.setTRKNTN(msgClass.getMessageNumber(19,0));
			msg.setTRTRST(msgClass.getMessageNumber(3,0, true));
			msg.setTRTSRC(msgClass.getMessageString(1));
			msg.setTRGTDT(msgClass.getMessageNumber(6,0));
			msg.setTRPERI(msgClass.getMessageNumber(6,0));
			msg.setTRIDRF(msgClass.getMessageString(15));
			msg.setTRKNTR(msgClass.getMessageString(6));
			msg.setTRBUST(msgClass.getMessageNumber(3,0));
			msg.setTRDSCC(msgClass.getMessageString(1));
			msg.setTRFKOD(msgClass.getMessageString(15));
			msg.setTRKORR(msgClass.getMessageString(1));
			msg.setV0CDAT(msgClass.getMessageNumber(4,0));
			msg.setTRNSET(msgClass.getMessageString(1));
			msg.setTRMTIN(msgClass.getMessageString(1));
			msg.setTRDTTM(msgClass.getMessageNumber(14,0));
			msg.setTRPEK(msgClass.getMessageNumber(7,0));
			msg.setTRSPST(msgClass.getMessageString(1));
			msg.setTRMEAC(msgClass.getMessageNumber(5,0));
			msg.setTRVAT(msgClass.getMessageNumber(15,2));
			msg.setTRNOD(msgClass.getMessageNumber(1,0));
			msg.setTRNODB(msgClass.getMessageNumber(1,0));
			msg.setTRNODS(msgClass.getMessageNumber(1,0));
			msg.setTRNODR(msgClass.getMessageNumber(1,0));
			msg.setTRASFC(msgClass.getMessageString(1));
			msg.setTRTRID(msgClass.getMessageString(3));
			msg.setTRRGKR(msgClass.getMessageString(1));
			msg.setTRRGAR(msgClass.getMessageString(1));
			msg.setTRPOSM(msgClass.getMessageString(2));
			msg.setTRPOSA(msgClass.getMessageString(19));
			msg.setTRCHID(msgClass.getMessageString(1));
			msg.setTRCHQN(msgClass.getMessageNumber(10,0));
			msg.setTRTMID(msgClass.getMessageString(8));
			msg.setTRAUCI(msgClass.getMessageString(1));
			msg.setTRVLCD(msgClass.getMessageString(4));
			msg.setTRIDDT(msgClass.getMessageNumber(4,0));
			msg.setTRCAID(msgClass.getMessageString(15));
			msg.setTRCNCD(msgClass.getMessageString(3));
			msg.setTRCPDD(msgClass.getMessageNumber(4,0));
			msg.setTRSSID(msgClass.getMessageString(4));
			msg.setTRGLRR(msgClass.getMessageNumber(13,0));
			msg.setTRONOF(msgClass.getMessageString(1));
			msg.setTRFBIN(msgClass.getMessageString(1));
			msg.setTRICCI(msgClass.getMessageString(1));
			msg.setTRICTI(msgClass.getMessageString(1));
			msg.setTRTRCF(msgClass.getMessageString(16));
			msg.setTRPOSD(msgClass.getMessageString(2));
			msg.setTRSRVC(msgClass.getMessageNumber(3,0));
			msg.setTRIPOS(msgClass.getMessageString(2));
			msg.setTRUMIN(msgClass.getMessageString(1));
			msg.setTRBR(msgClass.getMessageNumber(5,0));
			msg.setTRERPR(msgClass.getMessageNumber(5,3));
			msg.setTRECID(msgClass.getMessageString(3));
			msg.set_TYPE(msgClass.getMessageString(2));
			msg.setWDFFLG(msgClass.getMessageString(4));
			msg.setTRRVST(msgClass.getMessageString(1));
			msg.setTRTCKE(msgClass.getMessageString(10));
			msg.setWDACAT(msgClass.getMessageNumber(2,0));
			msg.setWDSTAS(msgClass.getMessageString(1));
			msg.setWDPOTC(msgClass.getMessageNumber(4,0));
			msg.setWDVTYP(msgClass.getMessageNumber(4,0));
			msg.setBKCITY(msgClass.getMessageString(25));
			msg.setBKPNR(msgClass.getMessageString(9));
			msg.setWDNETW(msgClass.getMessageString(3));
			msg.setTRCKRT(msgClass.getMessageNumber(19,0));
			msg.setTKTPAN(msgClass.getMessageNumber(19, 0));
			msg.setTRQRPI(msgClass.getMessageString(3));
			msg.setTRMPAN(msgClass.getMessageNumber(19, 0));
			msg.setTRQRIN(msgClass.getMessageString(1));
			msg.setWDDEVC(msgClass.getMessageString(5));
			
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
		return "GetTC5417";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

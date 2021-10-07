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
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import ktc_scs_schema.proxies.TC9001Rs;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC9001 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC9001(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC9001Rs msg = new TC9001Rs(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setWDKRTN(msgClass.getMessageNumber(19, false));
			msg.setWDSRVT(msgClass.getMessageString(1));
			msg.setIPKIPN1(msgClass.getMessageNumber(19, false));
			msg.setANATP1(msgClass.getMessageString(1));
			msg.setIPKIPN(msgClass.getMessageNumber(19, false));
			msg.setIPITP1(msgClass.getMessageString(3));
			msg.setIPOLIC(msgClass.getMessageString(40));
			msg.setIPFDAT(msgClass.getMessageNumber(8, false));
			msg.setIPSEX(msgClass.getMessageNumber(1, true));
			msg.setWDPKIP(msgClass.getMessageNumber(19, false));
			msg.setIPNAME(msgClass.getMessageString(40));
			msg.setIPNAM2(msgClass.getMessageString(40));
			msg.setIPTITL(msgClass.getMessageString(6));
			msg.setIPINIT(msgClass.getMessageString(40));
			msg.setIPLSNM(msgClass.getMessageString(40));
			msg.setWDTITL2(msgClass.getMessageString(6));
			msg.setIPTELHE(msgClass.getMessageNumber(7, false));
			msg.setIPTELAE(msgClass.getMessageNumber(7, false));
			msg.setIPTELH(msgClass.getMessageString(20));
			msg.setIPTELA(msgClass.getMessageString(20));
			msg.setIPTEL3(msgClass.getMessageString(20));
			msg.setIPEMLP(msgClass.getMessageString(100));
			msg.setIPARBG(msgClass.getMessageString(80));
			msg.setIPARB2(msgClass.getMessageString(80));
			msg.setWDPDAT(msgClass.getMessageNumber(2, false));
			msg.setIPINCO(msgClass.getMessageNumber(15, 2));
			msg.setIPOTAM(msgClass.getMessageNumber(15, 2));
			msg.setKRBKRD(msgClass.getMessageNumber(11, false));
			msg.setIPRLNM(msgClass.getMessageString(40));
			msg.setIPTELJ(msgClass.getMessageString(15));
			msg.setIPRLSP(msgClass.getMessageString(6));
			msg.setIPHUS(msgClass.getMessageString(3));
			msg.setWIPPPTY(msgClass.getMessageString(3));
			msg.setWDSTAY(msgClass.getMessageNumber(6, false));
			msg.setWIPBERO(msgClass.getMessageNumber(2, false));
			msg.setIPOCCP(msgClass.getMessageString(6));
			msg.setWDEMPL(msgClass.getMessageNumber(4, false));
			msg.setIPANST(msgClass.getMessageString(3));
			msg.setIPINDS(msgClass.getMessageString(6));
			msg.setWDSTMI(msgClass.getMessageString(1));
			msg.setIPNATI(msgClass.getMessageString(3));
			msg.setIPHEDU(msgClass.getMessageString(3));
			msg.setIPCIVS(msgClass.getMessageString(3));
			msg.setIPCTCD(msgClass.getMessageString(3));
			msg.setWDSTAF(msgClass.getMessageString(1));
			msg.setCUBAC3(msgClass.getMessageNumber(19, false));
			msg.setWDBNM3(msgClass.getMessageNumber(3, true));
			msg.setWDACT3(msgClass.getMessageString(2));
			msg.setCU2BAC3(msgClass.getMessageNumber(19, false));
			msg.setWD2BNM3(msgClass.getMessageNumber(3, true));
			msg.setWD2ACT3(msgClass.getMessageString(2));
			msg.setIPADTP(msgClass.getMessageString(1));
			msg.setIPADR1(msgClass.getMessageString(40));
			msg.setIPADR2(msgClass.getMessageString(40));
			msg.setIPADR3(msgClass.getMessageString(40));
			msg.setIPADR4(msgClass.getMessageString(40));
			msg.setIPCITY(msgClass.getMessageString(40));
			msg.setIPLSTE(msgClass.getMessageString(3));
			msg.setIPPNR(msgClass.getMessageString(9));
			msg.setAXADTP(msgClass.getMessageString(1));
			msg.setAXADR1(msgClass.getMessageString(40));
			msg.setAXADR2(msgClass.getMessageString(40));
			msg.setAXADR3(msgClass.getMessageString(40));
			msg.setAXADR4(msgClass.getMessageString(40));
			msg.setAXCITY(msgClass.getMessageString(40));
			msg.setAXLSTE(msgClass.getMessageString(3));
			msg.setAXPNR(msgClass.getMessageString(9));
			msg.setAX2ADTP(msgClass.getMessageString(1));
			msg.setAX2ADR1(msgClass.getMessageString(40));
			msg.setAX2ADR2(msgClass.getMessageString(40));
			msg.setAX2ADR3(msgClass.getMessageString(40));
			msg.setAX2ADR4(msgClass.getMessageString(40));
			msg.setAX2CITY(msgClass.getMessageString(40));
			msg.setAX2LSTE(msgClass.getMessageString(3));
			msg.setAX2PNR(msgClass.getMessageString(9));
			msg.setANRKID(msgClass.getMessageString(6));
			msg.setANSVID(msgClass.getMessageString(6));
			msg.setWPPPPID(msgClass.getMessageString(10));
			msg.setKRGACC(msgClass.getMessageNumber(19, false));
			msg.setKRPDAY(msgClass.getMessageNumber(2, false));
			msg.setANBKRD(msgClass.getMessageNumber(11, false));
			msg.setKRLMTF(msgClass.getMessageString(1));
			msg.setWDNCB(msgClass.getMessageString(1));
			msg.setANOTYP(msgClass.getMessageString(6));
			msg.setANLOCD(msgClass.getMessageString(13));
			msg.setANCHAN1(msgClass.getMessageString(5));
			msg.setANRCM1(msgClass.getMessageString(3));
			msg.setANRCM2(msgClass.getMessageString(3));
			msg.setKRCBIL(msgClass.getMessageString(1));
			msg.setKRLBIL(msgClass.getMessageString(1));
			msg.setANBANM1(msgClass.getMessageString(3));
			msg.setWGIDBAN(msgClass.getMessageString(19));
			msg.setWGIDBAT(msgClass.getMessageString(2));
			msg.setGIINST(msgClass.getMessageString(1));
			msg.setRLRELC(msgClass.getMessageString(6));
			msg.setANTELH(msgClass.getMessageString(20));
			msg.setWDSTFR(msgClass.getMessageString(1));
			msg.setCU3BAC3(msgClass.getMessageNumber(19, false));
			msg.setWD3BNM3(msgClass.getMessageNumber(3, true));
			msg.setWD3ACT3(msgClass.getMessageString(2));
			msg.setKTKRTN(msgClass.getMessageNumber(19, false));
			msg.setANEMNM(msgClass.getMessageString(26));
			msg.setANEMN1(msgClass.getMessageString(26));
			msg.setWDDESP(msgClass.getMessageString(2));
			msg.setANCLCB(msgClass.getMessageString(6));
			msg.setWANUAPV(msgClass.getMessageString(6));
			msg.setANEAPN(msgClass.getMessageString(20));
			msg.setWDRUSH(msgClass.getMessageString(1));
			msg.setKTCBI2(msgClass.getMessageString(1));
			msg.setKTCBI3(msgClass.getMessageString(1));
			msg.setWDTERM(msgClass.getMessageNumber(4, false));
			msg.setWDPYDT(msgClass.getMessageNumber(8, false));
			msg.setWDORGA(msgClass.getMessageNumber(15, false));
			msg.setWDBKDT(msgClass.getMessageNumber(8, false));
			msg.setWDKRTN1(msgClass.getMessageNumber(19, false));
			msg.setWDTTRM(msgClass.getMessageNumber(3, false));
			msg.setWDTINC(msgClass.getMessageString(3));
			msg.setWDTINA(msgClass.getMessageNumber(15, false));
			msg.setWD2TTRM(msgClass.getMessageNumber(3, false));
			msg.setWD2TINC(msgClass.getMessageString(3));
			msg.setWD2TINA(msgClass.getMessageNumber(15, false));
			msg.setWD3TTRM(msgClass.getMessageNumber(3, false));
			msg.setWD3TINC(msgClass.getMessageString(3));
			msg.setWD3TINA(msgClass.getMessageNumber(15, false));
			msg.setWD4TTRM(msgClass.getMessageNumber(3, false));
			msg.setWD4TINC(msgClass.getMessageString(3));
			msg.setWD4TINA(msgClass.getMessageNumber(15, false));
			msg.setWD5TTRM(msgClass.getMessageNumber(3, false));
			msg.setWD5TINC(msgClass.getMessageString(3));
			msg.setWD5TINA(msgClass.getMessageNumber(15, false));
			msg.setWD6TTRM(msgClass.getMessageNumber(3, false));
			msg.setWD6TINC(msgClass.getMessageString(3));
			msg.setWD6TINA(msgClass.getMessageNumber(15, false));
			msg.setWDBRNO(msgClass.getMessageString(5));
			msg.setWDTAXID(msgClass.getMessageString(40));
			
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
		return "GetTC9001";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
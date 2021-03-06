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
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC5401 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __request;
	private ktc_scs_schema.proxies.TC5401_KNTRSK32DS_Rq request;

	public SetTC5401(IContext context, IMendixObject request)
	{
		super(context);
		this.__request = request;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.request = __request == null ? null : ktc_scs_schema.proxies.TC5401_KNTRSK32DS_Rq.initialize(getContext(), __request);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();
		
		try {
			
			sb.append(MessageClass.setMessageNumber(this.request.getKRKNTN(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUPDT(),  8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBKRD  (), 11));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSLMT(), 11));
			sb.append(MessageClass.setMessageString(this.request.getKRLMTF(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKROTBM(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRKAID(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRCCDE(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSLDO(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUSLD(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLBET(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getWDTOTD(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getWDCURD(), 15));
			sb.append(MessageClass.setMessageString(this.request.getKRFSMD(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRFSM1(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRFSM2(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRF2VF(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAAY(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCAALVL(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRSTD(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRLVL(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES1(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES2(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES3(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES4(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES5(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES6(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES7(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES8(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES9(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES10(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES11(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES12(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES13(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRES14(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA1(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA2(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA3  (), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA4(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA5(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA6(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA7(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA8(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA9(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA10(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA11(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA12(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA13(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getCATIA14(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBPFR(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBETT(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRABEL(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBEL1(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBEL2(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBEL3(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSBPK(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRANTK(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAVST(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAVDT(), 8));
			sb.append(MessageClass.setMessageString(this.request.getKRMCDE(), 3));
			sb.append(MessageClass.setMessageString(this.request.getWDYENO(), 1));
			sb.append(MessageClass.setMessageString(this.request.getWDBCHR(), 1));
			sb.append(MessageClass.setMessageString(this.request.getNLNPLC(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRHSLD(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRHSFP(), 15));
			sb.append(MessageClass.setMessageString(this.request.getKRUSC1(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRUSC2(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRUSC3(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRUSC4(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRCBIL(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRAVFA(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRSTGR(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRBEVK(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKREXDT(), 8));
			sb.append(MessageClass.setMessageString(this.request.getKRRKID(), 6));
			sb.append(MessageClass.setMessageString(this.request.getKRPGRP(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRKIPN(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLOPN(), 11));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACAT(), 2));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAVIF(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRNOD(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRSVID(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSPLV(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRKNST(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUTKD(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRINTF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRPRBO(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAINB(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAINF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACRA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACRF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACAA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACAF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACIA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACIF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRATAX(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRATXF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRKRTS(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBFR1(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBFR2(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRFORB(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRFBET(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBKID(), 11));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAGDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAGIR(), 19));
			sb.append(MessageClass.setMessageString(this.request.getKRBANM(), 40));
			sb.append(MessageClass.setMessageNumber(this.request.getKRCACC(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getKRIACC  (), 19));
			sb.append(MessageClass.setMessageString(this.request.getKRREF(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRFBDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSLAD(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLMRJ(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRNKDB(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSTDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTBDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRIBDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAUDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAURJ(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSKKA(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSKUT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRBDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSTMP(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRANTA(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLPER(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRIKPR(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRIBID(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSCDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSCOR(), 5));
			sb.append(MessageClass.setMessageString(this.request.getKRAUAP(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRATML(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRSATP(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRSTRC(), 6));
			sb.append(MessageClass.setMessageString(this.request.getKRACT1(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRKTTP(), 3));
			sb.append(MessageClass.setMessageString(this.request.getKRMISF(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRATP1(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRPDAY(), 2));
			sb.append(MessageClass.setMessageNumber(this.request.getKRDBAL(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRPLIM(), 11));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTLIM(), 11));
			sb.append(MessageClass.setMessageString(this.request.getKRLFLG(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTLDT(), 8));
			sb.append(MessageClass.setMessageString(this.request.getKRPOFF(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRNPPD(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLADT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRADAT(), 8));
			sb.append(MessageClass.setMessageString(this.request.getKRBCDE(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBCDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRNTRD(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRNTRC(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTAMD(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTAMC(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSPMD(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSPMA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSPMN(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSPAM(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRTPDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRDAT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRFUDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUCIA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRDTTM(), 14));
			sb.append(MessageClass.setMessageNumber(this.request.getKRITFL(), 11));
			sb.append(MessageClass.setMessageNumber(this.request.getKRITFB(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRITFO  (), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRITFA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRITFP(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRAMTR(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRRTYP(), 2));
			sb.append(MessageClass.setMessageString(this.request.getKRSTRA(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKRLBIL(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSEQ1(), 4));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBR(), 5));
			sb.append(MessageClass.setMessageString(this.request.getCAAPID(), 3));
			sb.append(MessageClass.setMessageString(this.request.getCARCDE(), 2));
			sb.append(MessageClass.setMessageString(this.request.getWDBRCD(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getWDPRDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getWDAVS1(), 3));
			sb.append(MessageClass.setMessageString(this.request.getWDAGRP(), 1));
			sb.append(MessageClass.setMessageString(this.request.getCACSTC(), 3));
			sb.append(MessageClass.setMessageString(this.request.getCAPERM(), 1));
			sb.append(MessageClass.setMessageString(this.request.getCAUSER(), 10));
			sb.append(MessageClass.setMessageString(this.request.getCACLID(), 6));
			sb.append(MessageClass.setMessageString(this.request.getCAQUID(), 6));
			sb.append(MessageClass.setMessageString(this.request.getWDACID(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getWDNRDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getWDNTRM(), 4));
			sb.append(MessageClass.setMessageString(this.request.getWDDLYN(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getWDSTMD(), 8));
			sb.append(MessageClass.setMessageString(this.request.getWDBEVK(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getWDEXDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getWDSLAD(), 8));
			sb.append(MessageClass.setMessageString(this.request.getBLCKDL(), 1));
			sb.append(MessageClass.setMessageString(this.request.getIPNAME(), 40));
			sb.append(MessageClass.setMessageString(this.request.getUSLSNM(), 40));
			sb.append(MessageClass.setMessageString(this.request.getKXLOCD(), 13));
			sb.append(MessageClass.setMessageString(this.request.getKXAOCD(), 13));
			sb.append(MessageClass.setMessageString(this.request.getKXCHAN(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKRSTMI(), 2));
			sb.append(MessageClass.setMessageString(this.request.getKRAMIL(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBETF(), 5));
			sb.append(MessageClass.setMessageString(this.request.getKRNCBF(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getLAINAM(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getLLTERM(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getLLTMCR(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUPDT8(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKRFUDT8(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getLLORGA1(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getLLINNB(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getLLTMRM(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getLLCINT(), 17));
			sb.append(MessageClass.setMessageNumber(this.request.getLLINEX(), 5));
			sb.append(MessageClass.setMessageNumber(this.request.getUPPTOT(), 15));
			sb.append(MessageClass.setMessageString(this.request.getIPEMNM(), 26));
			sb.append(MessageClass.setMessageString(this.request.getIPEMN1(), 26));
			sb.append(MessageClass.setMessageNumber(this.request.getKTGTDT(), 6));
			sb.append(MessageClass.setMessageNumber(this.request.getKTLEMD(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getKTSPKD(), 1));
			sb.append(MessageClass.setMessageString(this.request.getKTCMPC(), 20));
			sb.append(MessageClass.setMessageString(this.request.getKRSTFR(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getWGOPTB(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRBETS(), 2));
			sb.append(MessageClass.setMessageNumber(this.request.getKTKRTN(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getLLORGA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRLALA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getKRUSGA(), 15));
			sb.append(MessageClass.setMessageNumber(this.request.getWOBKRT(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getKRACCP(), 2));
			sb.append(MessageClass.setMessageNumber(this.request.getLLLXDT(), 8));
			sb.append(MessageClass.setMessageNumber(this.request.getWDTPSD(), 15));
			
		} catch (Exception ex) {

			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}
		
		return sb.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5401";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://www.iec.ch/61850/2003/SCL" xsi:schemaLocation="http://www.iec.ch/61850/2003/SCL SCL.xsd" version="2007" revision="A">
 <Header id="SCL Example T1-1" toolID="SSI-Tool" nameStructure="IEDName" />
 <Substation name="S12" desc="Baden">
 <PowerTransformer name="T1" type="PTR">
 <LNode lnInst="1" lnClass="PDIF" ldInst="F1" iedName="D1Q1BP2" />
 <LNode lnInst="1" lnClass="YLTC" ldInst="S12D1T1" iedName="None" />
 <TransformerWinding name="W1" type="PTW">
 <Terminal connectivityNode="S12/D1/Q1/L1" substationName="S12" voltageLevelName="D1" bayName="Q1" cNodeName="L1" />
 </TransformerWinding>
 <TransformerWinding name="W2" type="PTW">
 <Terminal connectivityNode="S12/E1/Q2/L3" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L3" />
 </TransformerWinding>
 </PowerTransformer>
 <VoltageLevel name="D1">
 <Voltage multiplier="k" unit="V">220</Voltage>
 <Bay name="Q1">
 <LNode iedName="None" ldInst="S12D1Q1" lnClass="PDIS" lnInst="1" />
 <ConductingEquipment name="I1" type="CTR">
 <Terminal connectivityNode="S12/D1/Q1/L1" substationName="S12" voltageLevelName="D1" bayName="Q1" cNodeName="L1" />
 <SubEquipment name="R" phase="A">
 <LNode iedName="D1Q1BP2" ldInst="F1" lnClass="TCTR" lnInst="1" />
 </SubEquipment>
 <SubEquipment name="S" phase="B">
 <LNode iedName="D1Q1BP2" ldInst="F1" lnClass="TCTR" lnInst="2" />
 </SubEquipment>
 <SubEquipment name="T" phase="C">
 <LNode iedName="D1Q1BP2" ldInst="F1" lnClass="TCTR" lnInst="3" />
 </SubEquipment>
 <SubEquipment name="I0" phase="N">
 <LNode iedName="D1Q1BP2" ldInst="F1" lnClass="TCTR" lnInst="4" />
 </SubEquipment>
 </ConductingEquipment>
 <ConnectivityNode name="L1" pathName="S12/D1/Q1/L1" />
 </Bay>
 </VoltageLevel>
 <VoltageLevel name="E1">
 <Voltage multiplier="k" unit="V">132</Voltage>
 <Bay name="Q1">
 <LNode iedName="E1Q1SB1" ldInst="C1" lnClass="MMXN" lnInst="1" />
 <LNode iedName="None" ldInst="S12E1Q1" lnClass="PDIS" lnInst="1" />
 <LNode iedName="None" ldInst="F1" lnClass="PDIF" lnInst="1" />
 <ConductingEquipment name="QA1" type="CBR">
 <LNode iedName="E1Q1SB1" ldInst="C1" lnClass="CSWI" lnInst="1" />
 <Terminal connectivityNode="S12/E1/Q1/L1" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L1" />
 <Terminal connectivityNode="S12/E1/Q1/L2" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L2" />
 </ConductingEquipment>
 <ConductingEquipment name="QB1" type="DIS">
 <LNode iedName="E1Q1SB1" ldInst="C1" lnClass="CSWI" lnInst="2" />
 <LNode iedName="D1Q1SB4" ldInst="C1" lnClass="CILO" lnInst="1" />
 <Terminal connectivityNode="S12/E1/Q4/B1" substationName="S12" voltageLevelName="E1" bayName="Q4" cNodeName="B1" />
 <Terminal connectivityNode="S12/E1/Q1/L1" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L1" />
 </ConductingEquipment>
 <ConductingEquipment name="U1" type="VTR">
 <Terminal connectivityNode="S12/E1/Q1/L2" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L2" />
 <SubEquipment name="A" phase="A">
 <LNode iedName="E1Q1SB1" ldInst="C1" lnClass="TVTR" lnInst="1" />
 </SubEquipment>
 </ConductingEquipment>
 <ConductingEquipment name="I1" type="CTR">
 <Terminal connectivityNode="S12/E1/Q1/L3" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L3" />
 <Terminal connectivityNode="S12/E1/Q1/L2" substationName="S12" voltageLevelName="E1" bayName="Q1" cNodeName="L2" />
 </ConductingEquipment>
 <ConnectivityNode name="L1" pathName="S12/E1/Q1/L1" />
 <ConnectivityNode name="L2" pathName="S12/E1/Q1/L2" />
 <ConnectivityNode name="L3" pathName="S12/E1/Q1/L3" />
 </Bay>
 <Bay name="Q2" desc="Turgi">
 <ConductingEquipment name="QA1" type="CBR">
 <LNode iedName="D1Q1SB4" ldInst="C1" lnClass="CSWI" lnInst="1" />
 <Terminal connectivityNode="S12/E1/Q2/L0" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L0" />
 <Terminal connectivityNode="S12/E1/Q2/L1" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L1" />
 </ConductingEquipment>
 <ConductingEquipment name="QB1" type="DIS">
 <LNode iedName="D1Q1SB4" ldInst="C1" lnClass="CSWI" lnInst="2" />
 <LNode iedName="D1Q1SB4" ldInst="C1" lnClass="CILO" lnInst="2" />
 <Terminal connectivityNode="S12/E1/Q4/B1" substationName="S12" voltageLevelName="E1" bayName="Q4" cNodeName="B1" />
 <Terminal connectivityNode="S12/E1/Q2/L0" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L0" />
 </ConductingEquipment>
 <ConductingEquipment name="I1" type="CTR">
 <Terminal connectivityNode="S12/E1/Q2/L1" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L1" />
 <Terminal connectivityNode="S12/E1/Q2/L2" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L2" />
 </ConductingEquipment>
 <ConductingEquipment name="U1" type="VTR">
 <Terminal connectivityNode="S12/E1/Q2/L1" substationName="S12" voltageLevelName="E1" bayName="Q2" cNodeName="L1" />
 </ConductingEquipment>
 <ConnectivityNode name="L0" pathName="S12/E1/Q2/L0" />
 <ConnectivityNode name="L1" pathName="S12/E1/Q2/L1" />
 <ConnectivityNode name="L2" pathName="S12/E1/Q2/L2" />
 <ConnectivityNode name="L3" pathName="S12/E1/Q2/L3" />
 </Bay>
 <Bay name="Q3" desc="London">
 <LNode iedName="None" ldInst="LD0" lnClass="MMXN" lnInst="1" />
 <LNode iedName="None" ldInst="LD0" lnClass="PDIS" lnInst="1" />
 <LNode iedName="None" ldInst="LD0" lnClass="PDIF" lnInst="1" />
 <ConductingEquipment name="QA1" type="CBR">
 <LNode iedName="None" ldInst="C1" lnClass="CSWI" lnInst="1" />
 <Terminal connectivityNode="S12/E1/Q3/L1" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L1" />
 <Terminal connectivityNode="S12/E1/Q3/L2" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L2" />
 </ConductingEquipment>
 <ConductingEquipment name="QB1" type="DIS">
 <Terminal connectivityNode="S12/E1/Q4/B1" substationName="S12" voltageLevelName="E1" bayName="Q4" cNodeName="B1" />
 <Terminal connectivityNode="S12/E1/Q3/L1" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L1" />
 </ConductingEquipment>
 <ConductingEquipment name="U1" type="VTR">
 <Terminal connectivityNode="S12/E1/Q3/L2" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L2" />
 </ConductingEquipment>
 <ConductingEquipment name="I1" type="CTR">
 <Terminal connectivityNode="S12/E1/Q3/L3" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L3" />
 <Terminal connectivityNode="S12/E1/Q3/L2" substationName="S12" voltageLevelName="E1" bayName="Q3" cNodeName="L2" />
 </ConductingEquipment>
 <ConnectivityNode name="L1" pathName="S12/E1/Q3/L1" />
 <ConnectivityNode name="L2" pathName="S12/E1/Q3/L2" />
 <ConnectivityNode name="L3" pathName="S12/E1/Q3/L3" />
 </Bay>
 <Bay name="Q4">
 <ConnectivityNode name="B1" pathName="S12/E1/Q4/B1" />
 </Bay>
 </VoltageLevel>
 </Substation>
</SCL>
<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns:sxy="http://www.iec.ch/61850/2006/SCLcoordinates" xmlns="http://www.iec.ch/61850/2006/SCL">
  <Header id="project4" version="1" revision="1" toolID="SCL Manager" nameStructure="IEDName" />
  <Substation name="substation1" sxy:x="0" sxy:y="0">
    <VoltageLevel name="voltageLevel1" sxy:x="0" sxy:y="0">
      <Voltage unit="V">10</Voltage>
      <Bay name="bay1" sxy:x="1" sxy:y="1">
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay1/connvtyNode1" sxy:x="0" sxy:y="1" />
      </Bay>
      <Bay name="bay2" sxy:x="0" sxy:y="3">
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay2/connvtyNode1" sxy:x="1" sxy:y="0" />
      </Bay>
      <Bay name="bay3" sxy:x="14" sxy:y="4">
        <ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="3" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay2/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay2" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay3/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay3" cNodeName="connvtyNode2" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="1" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay1/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay1" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay3/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay3" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR1" type="CBR" sxy:x="2" sxy:y="2">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay3/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay3" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay3/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay3" cNodeName="connvtyNode2" />
        </ConductingEquipment>
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay3/connvtyNode1" sxy:x="1" sxy:y="2" />
        <ConnectivityNode name="connvtyNode2" pathName="substation1/voltageLevel1/bay3/connvtyNode2" sxy:x="3" sxy:y="2" />
      </Bay>
      <Bay name="bay4" sxy:x="9" sxy:y="4">
        <ConductingEquipment name="conEquipCBR1" type="CBR" sxy:x="1" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay1/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay1" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR2" type="CBR" sxy:x="4" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay2/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay2" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR3" type="CBR" sxy:x="2" sxy:y="3">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode2" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCTR1" type="CTR" sxy:x="2" sxy:y="5">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode2" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode3" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR4" type="CBR" sxy:x="2" sxy:y="7">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode3" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipIFL1" type="IFL" sxy:x="2" sxy:y="9">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipVTR1" type="VTR" sxy:x="3" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="1" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode4" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="1" sxy:y="6">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay4/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay4" cNodeName="connvtyNode3" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay4/connvtyNode1" sxy:x="2" sxy:y="3" />
        <ConnectivityNode name="connvtyNode2" pathName="substation1/voltageLevel1/bay4/connvtyNode2" sxy:x="2" sxy:y="5" />
        <ConnectivityNode name="connvtyNode3" pathName="substation1/voltageLevel1/bay4/connvtyNode3" sxy:x="2" sxy:y="6" />
        <ConnectivityNode name="connvtyNode4" pathName="substation1/voltageLevel1/bay4/connvtyNode4" sxy:x="2" sxy:y="8" />
      </Bay>
      <Bay name="bay5" sxy:x="5" sxy:y="4">
        <ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="1" sxy:y="6">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode2" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="1" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipVTR1" type="VTR" sxy:x="3" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipIFL1" type="IFL" sxy:x="2" sxy:y="9">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR1" type="CBR" sxy:x="2" sxy:y="7">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode2" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCTR1" type="CTR" sxy:x="2" sxy:y="5">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode3" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode2" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR2" type="CBR" sxy:x="2" sxy:y="3">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode4" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode3" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR3" type="CBR" sxy:x="3" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay2/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay2" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR4" type="CBR" sxy:x="0" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay1/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay1" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay5/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay5" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay5/connvtyNode1" sxy:x="2" sxy:y="8" />
        <ConnectivityNode name="connvtyNode2" pathName="substation1/voltageLevel1/bay5/connvtyNode2" sxy:x="2" sxy:y="6" />
        <ConnectivityNode name="connvtyNode3" pathName="substation1/voltageLevel1/bay5/connvtyNode3" sxy:x="2" sxy:y="5" />
        <ConnectivityNode name="connvtyNode4" pathName="substation1/voltageLevel1/bay5/connvtyNode4" sxy:x="2" sxy:y="3" />
      </Bay>
      <Bay name="bay6" sxy:x="1" sxy:y="4">
        <ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="0" sxy:y="6">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode2" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="0" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="null/null/null/null" substationName="null" voltageLevelName="null" bayName="null" cNodeName="null" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipVTR1" type="VTR" sxy:x="2" sxy:y="8">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipIFL1" type="IFL" sxy:x="1" sxy:y="9">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR1" type="CBR" sxy:x="1" sxy:y="7">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode2" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode1" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCTR1" type="CTR" sxy:x="1" sxy:y="5">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode3" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode2" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode2" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR2" type="CBR" sxy:x="1" sxy:y="4">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode4" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode3" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode3" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR3" type="CBR" sxy:x="3" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay2/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay2" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConductingEquipment name="conEquipCBR4" type="CBR" sxy:x="0" sxy:y="1">
          <Terminal name="terminal1" connectivityNode="substation1/voltageLevel1/bay1/connvtyNode1" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay1" cNodeName="connvtyNode1" />
          <Terminal name="terminal2" connectivityNode="substation1/voltageLevel1/bay6/connvtyNode4" substationName="substation1" voltageLevelName="voltageLevel1" bayName="bay6" cNodeName="connvtyNode4" />
        </ConductingEquipment>
        <ConnectivityNode name="connvtyNode1" pathName="substation1/voltageLevel1/bay6/connvtyNode1" sxy:x="2" sxy:y="8" />
        <ConnectivityNode name="connvtyNode2" pathName="substation1/voltageLevel1/bay6/connvtyNode2" sxy:x="2" sxy:y="6" />
        <ConnectivityNode name="connvtyNode3" pathName="substation1/voltageLevel1/bay6/connvtyNode3" sxy:x="2" sxy:y="5" />
        <ConnectivityNode name="connvtyNode4" pathName="substation1/voltageLevel1/bay6/connvtyNode4" sxy:x="2" sxy:y="3" />
      </Bay>
    </VoltageLevel>
  </Substation>
</SCL>
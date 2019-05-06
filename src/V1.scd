<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns:sxy="http://www.iec.ch/61850/2006/SCLcoordinates" xmlns="http://www.iec.ch/61850/2006/SCL">
  <Header id="project4" version="1" revision="1" toolID="SCL Manager" nameStructure="IEDName" />
	<Substation name="SUNNY1" sxy:x="0" sxy:y="0">
	<PowerTransformer name="T1" type="PTR" sxy:x="5" sxy:y="43" sxy:dir="vertical">
	<Text>AutoTransformers</Text>
    			<TransformerWinding name="transfmrWndg1" type="PTW">
    				<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay4/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay4" cNodeName="connvtyNode1" />
    				<Terminal name="T" connectivityNode="" substationName="SUNNY1" />
    			</TransformerWinding>
    			<TransformerWinding name="transfmrWndg2" type="PTW">
    				<Terminal name="terminal1" connectivityNode="SUNNY1/35kV/bay1/connvtyNode1" substationName="SUNNY1" voltageLevelName="35kV" bayName="bay1" cNodeName="connvtyNode1" />
    				<Terminal name="T" connectivityNode="" substationName="SUNNY1" />
    			</TransformerWinding>
    		</PowerTransformer>
    		<PowerTransformer name="T2" type="PTR" sxy:x="11" sxy:y="44" sxy:dir="vertical">
    		<Text>AutoTransformers</Text>
    			<TransformerWinding name="transfmrWndg1" type="PTW">
    				<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay8/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay8" cNodeName="connvtyNode1" />
    				<Terminal name="T" connectivityNode="" substationName="SUNNY1" />
    			</TransformerWinding>
    			<TransformerWinding name="transfmrWndg2" type="PTW">
    				<Terminal name="terminal1" connectivityNode="SUNNY1/35kV/bay1/connvtyNode1" substationName="SUNNY1" voltageLevelName="35kV" bayName="bay1" cNodeName="connvtyNode1" />
    			</TransformerWinding>
    		</PowerTransformer>
		<VoltageLevel name="220" sxy:x="0" sxy:y="0">
			<Voltage unit="V" multiplier="k">220</Voltage>
			<Bay name="bay1" sxy:x="0" sxy:y="7">
				<ConductingEquipment name="QS1_1" type="DIS" sxy:x="2" sxy:y="0">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="Q1" type="CBR" sxy:x="0" sxy:y="2">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode23" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode23" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode26" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode26" />
				</ConductingEquipment>
				<ConductingEquipment name="QS1_2" type="DIS" sxy:x="3" sxy:y="4">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode2" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
				<ConductingEquipment name="QS2_1" type="DIS" sxy:x="2" sxy:y="6">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode3" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode4" />
				</ConductingEquipment>
				<ConductingEquipment name="Q2" type="CBR" sxy:x="1" sxy:y="9">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode11" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode11" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode12" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode12" />
				</ConductingEquipment>
				<ConductingEquipment name="QS2_2" type="DIS" sxy:x="2" sxy:y="11">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode5" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="QS3_1" type="DIS" sxy:x="2" sxy:y="13">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode6" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode7" />
				</ConductingEquipment>
				<ConductingEquipment name="Q3" type="CBR" sxy:x="1" sxy:y="17">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode17" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode17" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode18" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode18" />
				</ConductingEquipment>
				<ConductingEquipment name="QS3_2" type="DIS" sxy:x="3" sxy:y="20">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode8" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_6" type="CTR" sxy:x="3" sxy:y="4" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode24" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode24" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_4" type="CTR" sxy:x="2" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode26" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode26" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode25" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode25" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_2" type="CTR" sxy:x="3" sxy:y="2" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode21" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode21" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode22" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode22" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_3" type="CTR" sxy:x="3" sxy:y="2" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode22" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode22" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode23" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode23" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_1" type="CTR" sxy:x="2" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode21" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode21" />
				</ConductingEquipment>
				<ConductingEquipment name="TA1_5" type="CTR" sxy:x="2" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode25" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode25" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode24" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode24" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_1" type="CTR" sxy:x="2" sxy:y="7" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode4" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode9" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode9" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_2" type="CTR" sxy:x="1" sxy:y="7">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode9" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode9" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode10" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode10" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_6" type="CTR" sxy:x="1" sxy:y="11">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode14" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode14" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode5" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_5" type="CTR" sxy:x="1" sxy:y="10">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode13" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode13" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode14" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode14" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_3" type="CTR" sxy:x="1" sxy:y="8">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode10" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode10" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode11" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode11" />
				</ConductingEquipment>
				<ConductingEquipment name="TA2_4" type="CTR" sxy:x="1" sxy:y="10">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode12" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode12" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode13" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode13" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3_1" type="CTR" sxy:x="1" sxy:y="15">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode7" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode15" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode15" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3_4" type="CTR" sxy:x="1" sxy:y="18">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode18" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode18" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode19" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode19" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3__3" type="CTR" sxy:x="1" sxy:y="16">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode16" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode16" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode17" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode17" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3_2" type="CTR" sxy:x="1" sxy:y="16">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode15" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode15" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode16" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode16" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3_6" type="CTR" sxy:x="3" sxy:y="19">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode20" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode20" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode8" />
				</ConductingEquipment>
				<ConductingEquipment name="TA3_5" type="CTR" sxy:x="1" sxy:y="18">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode19" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode19" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1/connvtyNode20" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode20" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG_W1" type="DIS" sxy:x="1" sxy:y="5" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG1_1" type="DIS" sxy:x="0" sxy:y="1">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG1_2" type="DIS" sxy:x="0" sxy:y="3">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG2_2" type="DIS" sxy:x="0" sxy:y="11">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode5" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG_T1" type="DIS" sxy:x="1" sxy:y="13">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG3_1" type="DIS" sxy:x="1" sxy:y="14">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode7" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG3_2" type="DIS" sxy:x="0" sxy:y="19">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode8" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG2_1" type="DIS" sxy:x="0" sxy:y="6">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode4" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/bay1/connvtyNode1" sxy:x="1" sxy:y="0" />
				<ConnectivityNode name="connvtyNode2" pathName="SUNNY1/220/bay1/connvtyNode2" sxy:x="1" sxy:y="4" />
				<ConnectivityNode name="connvtyNode3" pathName="SUNNY1/220/bay1/connvtyNode3" sxy:x="0" sxy:y="5" />
				<ConnectivityNode name="connvtyNode4" pathName="SUNNY1/220/bay1/connvtyNode4" sxy:x="0" sxy:y="6" />
				<ConnectivityNode name="connvtyNode5" pathName="SUNNY1/220/bay1/connvtyNode5" sxy:x="0" sxy:y="11" />
				<ConnectivityNode name="connvtyNode6" pathName="SUNNY1/220/bay1/connvtyNode6" sxy:x="0" sxy:y="12" />
				<ConnectivityNode name="connvtyNode7" pathName="SUNNY1/220/bay1/connvtyNode7" sxy:x="2" sxy:y="14" />
				<ConnectivityNode name="connvtyNode8" pathName="SUNNY1/220/bay1/connvtyNode8" sxy:x="1" sxy:y="19" />
				<ConnectivityNode name="connvtyNode9" pathName="SUNNY1/220/bay1/connvtyNode9" sxy:x="2" sxy:y="6" />
				<ConnectivityNode name="connvtyNode10" pathName="SUNNY1/220/bay1/connvtyNode10" sxy:x="2" sxy:y="7" />
				<ConnectivityNode name="connvtyNode11" pathName="SUNNY1/220/bay1/connvtyNode11" sxy:x="2" sxy:y="8" />
				<ConnectivityNode name="connvtyNode12" pathName="SUNNY1/220/bay1/connvtyNode12" sxy:x="2" sxy:y="9" />
				<ConnectivityNode name="connvtyNode13" pathName="SUNNY1/220/bay1/connvtyNode13" sxy:x="2" sxy:y="9" />
				<ConnectivityNode name="connvtyNode14" pathName="SUNNY1/220/bay1/connvtyNode14" sxy:x="2" sxy:y="10" />
				<ConnectivityNode name="connvtyNode15" pathName="SUNNY1/220/bay1/connvtyNode15" sxy:x="2" sxy:y="15" />
				<ConnectivityNode name="connvtyNode16" pathName="SUNNY1/220/bay1/connvtyNode16" sxy:x="2" sxy:y="16" />
				<ConnectivityNode name="connvtyNode17" pathName="SUNNY1/220/bay1/connvtyNode17" sxy:x="2" sxy:y="16" />
				<ConnectivityNode name="connvtyNode18" pathName="SUNNY1/220/bay1/connvtyNode18" sxy:x="2" sxy:y="17" />
				<ConnectivityNode name="connvtyNode19" pathName="SUNNY1/220/bay1/connvtyNode19" sxy:x="2" sxy:y="18" />
				<ConnectivityNode name="connvtyNode20" pathName="SUNNY1/220/bay1/connvtyNode20" sxy:x="2" sxy:y="18" />
				<ConnectivityNode name="connvtyNode21" pathName="SUNNY1/220/bay1/connvtyNode21" sxy:x="1" sxy:y="1" />
				<ConnectivityNode name="connvtyNode22" pathName="SUNNY1/220/bay1/connvtyNode22" sxy:x="2" sxy:y="1" />
				<ConnectivityNode name="connvtyNode23" pathName="SUNNY1/220/bay1/connvtyNode23" sxy:x="3" sxy:y="2" />
				<ConnectivityNode name="connvtyNode24" pathName="SUNNY1/220/bay1/connvtyNode24" sxy:x="2" sxy:y="3" />
				<ConnectivityNode name="connvtyNode25" pathName="SUNNY1/220/bay1/connvtyNode25" sxy:x="1" sxy:y="3" />
				<ConnectivityNode name="connvtyNode26" pathName="SUNNY1/220/bay1/connvtyNode26" sxy:x="1" sxy:y="2" />
			</Bay>
			<Bay name="E1" sxy:x="0" sxy:y="1">
				<Text>Bus</Text>
				<ConductingEquipment name="QSG1_E1" type="DIS" sxy:x="3" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG2_E1" type="DIS" sxy:x="7" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="QS_E1" type="DIS" sxy:x="13" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/E1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG3_E1" type="DIS" sxy:x="15" sxy:y="1" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS5" type="DIS" sxy:x="13" sxy:y="2" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="TV_E1" type="VTR" sxy:x="13" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/E1/connvtyNode1" sxy:x="0" sxy:y="0" />
				<ConnectivityNode name="connvtyNode2" pathName="SUNNY1/220/E1/connvtyNode2" sxy:x="12" sxy:y="2" />
			</Bay>
			<Bay name="E2" sxy:x="1" sxy:y="37">
				<Text>Bus</Text>
				<ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="1" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="8" sxy:y="1" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="TV_E2" type="VTR" sxy:x="12" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS3" type="DIS" sxy:x="11" sxy:y="2" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/E2/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS4" type="DIS" sxy:x="9" sxy:y="3" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS5" type="DIS" sxy:x="9" sxy:y="1" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/E2/connvtyNode1" sxy:x="0" sxy:y="1" />
				<ConnectivityNode name="connvtyNode2" pathName="SUNNY1/220/E2/connvtyNode2" sxy:x="11" sxy:y="3" />
			</Bay>
			<Bay name="bay4" sxy:x="5" sxy:y="31">
				<ConductingEquipment name="conEquipVTR1" type="VTR" sxy:x="1" sxy:y="0" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="1" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay4/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay4" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="1" sxy:y="1" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode6" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay4/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay4" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/bay4/connvtyNode1" sxy:x="2" sxy:y="3" />
			</Bay>
			<Bay name="bay5" sxy:x="5" sxy:y="11">
				<ConductingEquipment name="W1" type="IFL" sxy:x="1" sxy:y="0">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
			</Bay>
			<Bay name="bay7" sxy:x="13" sxy:y="10">
				<ConductingEquipment name="W2" type="IFL" sxy:x="1" sxy:y="1">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
			</Bay>
			<Bay name="bay8" sxy:x="14" sxy:y="31">
				<ConductingEquipment name="conEquipVTR2" type="VTR" sxy:x="2" sxy:y="0" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS1" type="DIS" sxy:x="1" sxy:y="3" sxy:dir="vertical">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay8/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay8" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS2" type="DIS" sxy:x="1" sxy:y="1" sxy:dir="horizontal">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode6" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay8/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay8" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/bay8/connvtyNode1" sxy:x="2" sxy:y="2" />
			</Bay>
			<Bay name="bay1_1" sxy:x="8" sxy:y="7">
				<ConductingEquipment name="QS4_1" type="DIS" sxy:x="2" sxy:y="0">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/E1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E1" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="Q4" type="CBR" sxy:x="1" sxy:y="2">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode23" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode23" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode26" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode26" />
				</ConductingEquipment>
				<ConductingEquipment name="QS4_2" type="DIS" sxy:x="3" sxy:y="4">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode2" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
				<ConductingEquipment name="QS5_1" type="DIS" sxy:x="3" sxy:y="5">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode3" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode4" />
				</ConductingEquipment>
				<ConductingEquipment name="Q5" type="CBR" sxy:x="1" sxy:y="8">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode11" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode11" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode12" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode12" />
				</ConductingEquipment>
				<ConductingEquipment name="QS5_2" type="DIS" sxy:x="3" sxy:y="11">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode5" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="QS6_1" type="DIS" sxy:x="1" sxy:y="13">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode6" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode7" />
				</ConductingEquipment>
				<ConductingEquipment name="Q6" type="CBR" sxy:x="1" sxy:y="17">
				<Text>selectionalizingBreaker</Text>
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode17" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode17" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode18" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode18" />
				</ConductingEquipment>
				<ConductingEquipment name="QS6_2" type="DIS" sxy:x="2" sxy:y="19">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode8" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/E2/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="E2" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_6" type="CTR" sxy:x="3" sxy:y="3">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode24" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode24" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_4" type="CTR" sxy:x="2" sxy:y="3">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode26" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode26" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode25" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode25" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_2" type="CTR" sxy:x="2" sxy:y="1">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode21" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode21" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode22" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode22" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_3" type="CTR" sxy:x="3" sxy:y="1">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode22" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode22" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode23" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode23" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_1" type="CTR" sxy:x="2" sxy:y="1">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode1" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode21" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode21" />
				</ConductingEquipment>
				<ConductingEquipment name="TA4_5" type="CTR" sxy:x="2" sxy:y="3">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode25" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode25" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode24" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode24" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_1" type="CTR" sxy:x="3" sxy:y="6">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode4" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode9" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode9" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_2" type="CTR" sxy:x="1" sxy:y="7">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode9" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode9" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode10" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode10" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_6" type="CTR" sxy:x="1" sxy:y="10">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode14" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode14" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode5" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_5" type="CTR" sxy:x="0" sxy:y="10">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode13" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode13" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode14" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode14" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_3" type="CTR" sxy:x="1" sxy:y="7">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode10" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode10" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode11" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode11" />
				</ConductingEquipment>
				<ConductingEquipment name="TA5_4" type="CTR" sxy:x="1" sxy:y="9">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode12" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode12" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode13" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode13" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_1" type="CTR" sxy:x="1" sxy:y="15">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode7" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode15" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode15" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_4" type="CTR" sxy:x="1" sxy:y="17">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode18" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode18" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode19" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode19" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_3" type="CTR" sxy:x="1" sxy:y="16">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode16" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode16" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode17" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode17" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_2" type="CTR" sxy:x="1" sxy:y="15">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode15" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode15" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode16" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode16" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_6" type="CTR" sxy:x="3" sxy:y="19">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode20" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode20" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode8" />
				</ConductingEquipment>
				<ConductingEquipment name="TA6_5" type="CTR" sxy:x="1" sxy:y="18">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode19" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode19" />
					<Terminal name="terminal2" connectivityNode="SUNNY1/220/bay1_1/connvtyNode20" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode20" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG6_1" type="DIS" sxy:x="1" sxy:y="14">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode7" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode7" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG_T2" type="DIS" sxy:x="0" sxy:y="12">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode6" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode6" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG5_2" type="DIS" sxy:x="1" sxy:y="11">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode5" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode5" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG5_1" type="DIS" sxy:x="2" sxy:y="6">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode4" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode4" />
				</ConductingEquipment>
				<ConductingEquipment name="conEquipDIS7_4" type="DIS" sxy:x="1" sxy:y="5">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode3" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode3" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG4_2" type="DIS" sxy:x="1" sxy:y="4">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode2" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode2" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG4_1" type="DIS" sxy:x="0" sxy:y="0">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode1" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode1" />
				</ConductingEquipment>
				<ConductingEquipment name="QSG6_2" type="DIS" sxy:x="1" sxy:y="19">
					<Terminal name="terminal1" connectivityNode="SUNNY1/220/bay1_1/connvtyNode8" substationName="SUNNY1" voltageLevelName="220" bayName="bay1_1" cNodeName="connvtyNode8" />
				</ConductingEquipment>
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/220/bay1_1/connvtyNode1" sxy:x="1" sxy:y="1" />
				<ConnectivityNode name="connvtyNode2" pathName="SUNNY1/220/bay1_1/connvtyNode2" sxy:x="2" sxy:y="4" />
				<ConnectivityNode name="connvtyNode3" pathName="SUNNY1/220/bay1_1/connvtyNode3" sxy:x="2" sxy:y="5" />
				<ConnectivityNode name="connvtyNode4" pathName="SUNNY1/220/bay1_1/connvtyNode4" sxy:x="2" sxy:y="6" />
				<ConnectivityNode name="connvtyNode5" pathName="SUNNY1/220/bay1_1/connvtyNode5" sxy:x="2" sxy:y="11" />
				<ConnectivityNode name="connvtyNode6" pathName="SUNNY1/220/bay1_1/connvtyNode6" sxy:x="2" sxy:y="13" />
				<ConnectivityNode name="connvtyNode7" pathName="SUNNY1/220/bay1_1/connvtyNode7" sxy:x="2" sxy:y="15" />
				<ConnectivityNode name="connvtyNode8" pathName="SUNNY1/220/bay1_1/connvtyNode8" sxy:x="2" sxy:y="19" />
				<ConnectivityNode name="connvtyNode9" pathName="SUNNY1/220/bay1_1/connvtyNode9" sxy:x="2" sxy:y="7" />
				<ConnectivityNode name="connvtyNode10" pathName="SUNNY1/220/bay1_1/connvtyNode10" sxy:x="2" sxy:y="8" />
				<ConnectivityNode name="connvtyNode11" pathName="SUNNY1/220/bay1_1/connvtyNode11" sxy:x="1" sxy:y="8" />
				<ConnectivityNode name="connvtyNode12" pathName="SUNNY1/220/bay1_1/connvtyNode12" sxy:x="2" sxy:y="9" />
				<ConnectivityNode name="connvtyNode13" pathName="SUNNY1/220/bay1_1/connvtyNode13" sxy:x="2" sxy:y="10" />
				<ConnectivityNode name="connvtyNode14" pathName="SUNNY1/220/bay1_1/connvtyNode14" sxy:x="1" sxy:y="10" />
				<ConnectivityNode name="connvtyNode15" pathName="SUNNY1/220/bay1_1/connvtyNode15" sxy:x="2" sxy:y="15" />
				<ConnectivityNode name="connvtyNode16" pathName="SUNNY1/220/bay1_1/connvtyNode16" sxy:x="1" sxy:y="16" />
				<ConnectivityNode name="connvtyNode17" pathName="SUNNY1/220/bay1_1/connvtyNode17" sxy:x="1" sxy:y="17" />
				<ConnectivityNode name="connvtyNode18" pathName="SUNNY1/220/bay1_1/connvtyNode18" sxy:x="1" sxy:y="18" />
				<ConnectivityNode name="connvtyNode19" pathName="SUNNY1/220/bay1_1/connvtyNode19" sxy:x="1" sxy:y="18" />
				<ConnectivityNode name="connvtyNode20" pathName="SUNNY1/220/bay1_1/connvtyNode20" sxy:x="1" sxy:y="19" />
				<ConnectivityNode name="connvtyNode21" pathName="SUNNY1/220/bay1_1/connvtyNode21" sxy:x="1" sxy:y="2" />
				<ConnectivityNode name="connvtyNode22" pathName="SUNNY1/220/bay1_1/connvtyNode22" sxy:x="2" sxy:y="2" />
				<ConnectivityNode name="connvtyNode23" pathName="SUNNY1/220/bay1_1/connvtyNode23" sxy:x="3" sxy:y="2" />
				<ConnectivityNode name="connvtyNode24" pathName="SUNNY1/220/bay1_1/connvtyNode24" sxy:x="2" sxy:y="4" />
				<ConnectivityNode name="connvtyNode25" pathName="SUNNY1/220/bay1_1/connvtyNode25" sxy:x="1" sxy:y="3" />
				<ConnectivityNode name="connvtyNode26" pathName="SUNNY1/220/bay1_1/connvtyNode26" sxy:x="1" sxy:y="3" />
			</Bay>
		</VoltageLevel>
		<VoltageLevel name="35kV" sxy:x="3" sxy:y="46">
			<Voltage unit="V" multiplier="k">35</Voltage>
			<Bay name="bay1" sxy:x="1" sxy:y="1">
				<ConnectivityNode name="connvtyNode1" pathName="SUNNY1/35kV/bay1/connvtyNode1" sxy:x="1" sxy:y="1" sxy:dir="horizontal" />
			</Bay>
		</VoltageLevel>
	</Substation>
</SCL>
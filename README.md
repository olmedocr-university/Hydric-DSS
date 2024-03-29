# Guided exercise 3 - Hydric-DSS
## Index
- HDSS-RF-01
  - Equivalence classes
  - Boundary limits
  - Test cases
  - Syntax analysis
- HDSS-RF-02
  - Equivalence classes
  - Boundary limits
  - Test cases
  - Syntax analysis
- HDSS-RF-03
  - Syntax analysis

## HDSS-RF-01
### Equivalence classes
- Equivalence class: HDSS-FN1-EQ-1
  - Input:  Non existing filename
  - Result: Error. "An input data file is not found"

- Equivalence class: HDSS-FN1-EQ-2
  - Input: Valid filename "validRegisterHydricResourcesCase.json"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-3
  - Input: Valid JSON file
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-4
  - Input: Non JSON format
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-5
  - Input: Empty file
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-6
  - Input: Non empty file
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-7
  - Input: Existing irrigation basin name
  - Result: Error. "Tried to record an irrigation basin with an existing name"

- Equivalence class: HDSS-FN1-EQ-8
  - Input: Non existing irrigation basin name
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-9
  - Input: Under 50 chars irrigation basin name "shortName"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-10
  - Input: Over 50 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-11
  - Input: No irrigation basin name found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-12
  - Input: Two or more irrigation basin names found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-13
  - Input: One irrigation basin name found
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-14
  - Input: No resources list found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-15
  - Input: Two or more resources lists found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-16
  - Input: One resources list found
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-17
  - Input: Existing resource name
  - Result: Error. "Tried to record a resource basin with an existing name"

- Equivalence class: HDSS-FN1-EQ-18
  - Input: Non existing resource name
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-19
  - Input: Under 50 chars resource basin name "shortName"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-20
  - Input: Over 50 chars resource name "reallyreallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-21
  - Input: No resource name found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-22
  - Input: Two or more resource names found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-23
  - Input: One resource basin name found
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-24
  - Input: Resource type value = "Reservoir"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-25
  - Input: Resource type value = "Desalination plant"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-26
  - Input: Resource type value = "Aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-27
  - Input: Resource type value = "My mom"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-28
  - Input: No resource type found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-29
  - Input: Two or more resource types found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-30
  - Input: One resource basin type found
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-31
  - Input: Negative capacity
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-32
  - Input: Positive capacity
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-33
  - Input: Capacity values is not a number "2.23"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-34
  - Input: Capacity values is a number "2.23"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-35
  - Input: Capacity values is a number with more than 2 decimals "2.231"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-36
  - Input: Capacity values is a number with 2 or less decimals "2.23"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-37
  - Input: No capacity found and resource type is not "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-38
  - Input: Two or more capacity values found and resource type is not "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN1-EQ-39
  - Input: One capacity value found and resource type is not "aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-40
  - Input: No capacity found and resource type is "aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN1-EQ-41
  - Input: One or more capacity values found and resource type is "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

### Boundary limits
- Boundary limit: HDSS-FN1-BL-1
  - Input: 49 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongNam"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-2
  - Input: 50 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-3
  - Input: 51 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongNamee"
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN1-BL-4
  - Input: 49 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongNam"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-5
  - Input: 50 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-6
  - Input: 51 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongNamee"
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN1-BL-7
  - Input: Capacity value 0.00
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-8
  - Input: Capacity value 0.01
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-9
  - Input: Capacity value -0.01
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN1-BL-10
  - Input capacity: capacity with 2 decimals "2.23"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-11
  - Input capacity: capacity with 1 decimal "2.2"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-12
  - Input capacity: capacity with no decimals "2"
  - Result: valid case

- Boundary limit: HDSS-FN1-BL-13
  - Input capacity: capacity with 3 decimal "2.223"
  - Result: Error: "The input file has no data or does not match the expected format"

### Test cases
#### HDSS-FN1-TC-1
- Equivalence classes considered:   HDSS-FN1-EQ-2, HDSS-FN1-EQ-3, HDSS-FN1-EQ-6, HDSS-FN1-EQ-8, HDSS-FN1-EQ-9, HDSS-FN1-EQ-13, HDSS-FN1-EQ-16, HDSS-FN1-EQ-18, HDSS-FN1-EQ-19, HDSS-FN1-EQ-23, HDSS-FN1-EQ-24, HDSS-FN1-EQ-25, HDSS-FN1-EQ-26, HDSS-FN1-EQ-30, HDSS-FN1-EQ-32, HDSS-FN1-EQ-34, HDSS-FN1-EQ-36, HDSS-FN1-EQ-39, HDSS-FN1-EQ-40
- Input:
  - Filename: "hdss-rf01-validRegisterHydricResourcesCase.json"
  - Expected output: "hdss-rf01-expectedValidRegisterHydricResourcesCase.json"

#### HDSS-FN1-TC-2
- Equivalence class considered: HDSS-FN1-EQ-1
- Input:
  - Filename "nonexists.json"
  - Expected output: Throws Exception. Error message: "An input data file is not found"

#### HDSS-FN1-TC-3
- Boundary limit considered: HDSS-FN1-BL-7
- Input:
  - Filename "hdss-rf01-capacityZero.json"
  - Expected output: "hdss-rf01-expectedCapacityZero.json"

#### HDSS-FN1-TC-4
- Equivalence class considered: HDSS-FN1-EQ-4
- Input:
  - Filename "hdss-rf01-invalidJson.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-5
- Equivalence class considered: HDSS-FN1-EQ-5
- Input:
  - Filename "hdss-rf01-empty.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-6
- Equivalence class considered: HDSS-FN1-EQ-7
- Input:
  - Filename "hdss-rf01-existingIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "Tried to record an irrigation basin with an existing name"

#### HDSS-FN1-TC-7
- Equivalence class considered: HDSS-FN1-EQ-10
- Input:
  - Filename "hdss-rf01-longIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-8
- Equivalence class considered: HDSS-FN1-EQ-11
- Input:
  - Filename "hdss-rf01-noIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-9
- Equivalence class considered: HDSS-FN1-EQ-12
- Input:
  - Filename "hdss-rf01-severalIrrigationBasinNames.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-10
- Equivalence class considered: HDSS-FN1-EQ-14
- Input:
  - Filename "hdss-rf01-noResourcesList.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-11
- Equivalence class considered: HDSS-FN1-EQ-15
- Input:
  - Filename "hdss-rf01-severalResourcesLists.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-12
- Equivalence class considered: HDSS-FN1-EQ-17
- Input:
  - Filename "hdss-rf01-existingResourceName.json"
  - Expected output: Throws Exception. Error message: "Tried to record a resource basin with an existing name"

#### HDSS-FN1-TC-13
- Equivalence class considered: HDSS-FN1-EQ-20
- Input:
  - Filename "hdss-rf01-longResourceName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-14
- Equivalence class considered: HDSS-FN1-EQ-21
- Input:
  - Filename "hdss-rf01-noResourceName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-15
- Equivalence class considered: HDSS-FN1-EQ-22
- Input:
  - Filename "hdss-rf01-severalResourceNames.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-16
- Equivalence class considered: HDSS-FN1-EQ-27
- Input:
  - Filename "hdss-rf01-invalidResourceType.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-17
- Equivalence class considered: HDSS-FN1-EQ-28
- Input:
  - Filename "hdss-rf01-noResourceType.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-18
- Equivalence class considered: HDSS-FN1-EQ-29
- Input:
  - Filename "hdss-rf01-severalResourceTypes.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-19
- Equivalence class considered: HDSS-FN1-EQ-31
- Input:
  - Filename "hdss-rf01-negativeResourceCapacity.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-20
- Equivalence class considered: HDSS-FN1-EQ-33
- Input:
  - Filename "hdss-rf01-notValidResourceCapacity.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-21
- Equivalence class considered: HDSS-FN1-EQ-35
- Input:
  - Filename "hdss-rf01-notValidResourceCapacityDecimalFormat.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-22
- Equivalence class considered: HDSS-FN1-EQ-37
- Input:
  - Filename "hdss-rf01-noCapacityNotAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-23
- Equivalence class considered: HDSS-FN1-EQ-38
- Input:
  - Filename "hdss-rf01-severalCapacityValuesNotAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-24
- Equivalence class considered: HDSS-FN1-EQ-41
- Input:
  - Filename "hdss-rf01-capacityFoundAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-25
- Boundary limit considered: HDSS-FN1-BL-1
- Input:
    - Filename "hdss-rf01-validIrrigationBasinName49.json"
    - Expected output: "hdss-rf01-expectedValidIrrigationBasinName49.json"

#### HDSS-FN1-TC-26
- Boundary limit considered: HDSS-FN1-BL-2
- Input:
    - Filename "hdss-rf01-validIrrigationBasinName50.json"
    - Expected output: "hdss-rf01-expectedValidIrrigationBasinName50.json"

#### HDSS-FN1-TC-27
- Boundary limit considered: HDSS-FN1-BL-3
- Input:
    - Filename "hdss-rf01-invalidIrrigationBasinName.json"
    - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-28
- Boundary limit considered: HDSS-FN1-BL-4
- Input:
    - Filename "hdss-rf01-validResourceName49.json"
    - Expected output: "hdss-rf01-expectedValidResourceName49.json"

#### HDSS-FN1-TC-29
- Boundary limit considered: HDSS-FN1-BL-5
- Input:
    - Filename "hdss-rf01-validResourceName50.json"
    - Expected output: "hdss-rf01-expectedValidResourceName50.json"

#### HDSS-FN1-TC-30
- Boundary limit considered: HDSS-FN1-BL-6
- Input:
    - Filename "hdss-rf01-invalidResourceName.json"
    - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-31
- Boundary limit considered: HDSS-FN1-BL-8
- Input:
    - Filename "hdss-rf01-validResourceCapacity0_01.json"
    - Expected output: "hdss-rf01-expectedValidResourceCapacity0_01.json"

#### HDSS-FN1-TC-32
- Boundary limit considered: HDSS-FN1-BL-9
- Input:
    - Filename "hdss-rf01-invalidResourceCapacity.json"
    - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN1-TC-33
- Boundary limit considered: HDSS-FN1-BL-10
- Input:
    - Filename "hdss-rf01-validResourceCapacityTwoDecimals.json"
    - Expected output: "hdss-rf01-expectedValidResourceCapacityTwoDecimals.json"

#### HDSS-FN1-TC-34
- Boundary limit considered: HDSS-FN1-BL-11
- Input:
    - Filename "hdss-rf01-validResourceCapacityOneDecimal.json"
    - Expected output: "hdss-rf01-expectedValidResourceCapacityOneDecimal.json"

#### HDSS-FN1-TC-35
- Boundary limit considered: HDSS-FN1-BL-12
- Input:
    - Filename "hdss-rf01-validResourceCapacityZeroDecimals.json"
    - Expected output: "hdss-rf01-expectedValidResourceCapacityZeroDecimals.json"

#### HDSS-FN1-TC-36
- Boundary limit considered: HDSS-FN1-BL-13
- Input:
    - Filename "hdss-rf01-invalidResourceCapacityThreeDecimals.json"
    - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

### Syntax analysis (Grammar)
- **File::=** Init_Object Body End_Object
- **Body::=** Irrigation_Basin_Name Label_Value_Separator Resources

- **Irrigation_Basin_Name::=** Quotes Irrigation_Basin_Name_Value Quotes
- **Resources::=** Init_Array 0{Resource_Object Fields_Separator}n 0{Resource_Object}1 End_Array

- **Irrigation_Basin_Name_Value::==** 1{Character}50

- **Resource_Object::=** Init_Object Resource_Name Fields_Separator Resource_Type Fields_Separator Resource_Capacity End_Object

- **Resource_Name::=** Quotes Resource_Name_Label Quotes Label_Value_Separator Quotes Resource_Name_Value Quotes
- **Resource_Type::=** Quotes Resource_Type_Label Quotes Label_Value_Separator Quotes Resource_Type_Value Quotes
- **Resource_Capacity::=** Quotes Resource_Capacity_Label Quotes Label_Value_Separator Resource_Capacity_Value

- **Resource_Name_Label::=** 'Name'
- **Resource_Type_Label::=** 'Type'
- **Resource_Capacity_Label::=** 'Capacity'

- **Resource_Name_Value::=** 1{Character}50
- **Resource_Type_Value::=** 'Reservoir'|'Desalination plant'|'Aquifer'
- **Resource_Capacity_Value::=** 1{Number}n 0{Point 0{Number}2 }1

- **Init_Object::=**'{'
- **End_Object::=**'}'
- **Label_Value_Separator::=**':'
- **Init_Array::=**'['
- **End_Array::=**']'
- **Fields_Separator::=**','
- **Quotes::=**'"'

- **Character::=**'a'|'b'|'c'|...|'z'
- **Point::=**'.'
- **Number::=**'0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'

### Derivation trees
#### Derivation tree 1
![](img/FN1/DerivationTreeFN1-01.png?raw=true)
#### Derivation tree 2
![](img/FN1/DerivationTreeFN1-02.png?raw=true)
#### Derivation tree 3
![](img/FN1/DerivationTreeFN1-03.png?raw=true)
#### Derivation tree 4
![](img/FN1/DerivationTreeFN1-04.png?raw=true)
#### Derivation tree 5
![](img/FN1/DerivationTreeFN1-05.png?raw=true)
#### Derivation tree 6
![](img/FN1/DerivationTreeFN1-06.png?raw=true)
#### Derivation tree 7
![](img/FN1/DerivationTreeFN1-07.png?raw=true)
#### Derivation tree 8
![](img/FN1/DerivationTreeFN1-08.png?raw=true)
#### Derivation tree 9
![](img/FN1/DerivationTreeFN1-09.png?raw=true)
#### Derivation tree 10
![](img/FN1/DerivationTreeFN1-10.png?raw=true)

### Test cases
#### HDSS-FN1-S-TC-1
- Type of case: Node omission
- Input: hdss-rf01-syntaxError1.json
- Expected value: Error: "Empty file"

#### HDSS-FN1-S-TC-2
- Type of case: Node omission
- Input: hdss-rf01-syntaxError2.json
- Expected value: Error: "Missing {"

#### HDSS-FN1-S-TC-3
- Type of case: Node omission
- Input: hdss-rf01-syntaxError3.json
- Expected value: Error: "Missing body"

#### HDSS-FN1-S-TC-4
- Type of case: Node omission
- Input: hdss-rf01-syntaxError4.json
- Expected value: Error: "Missing }"

#### HDSS-FN1-S-TC-5
- Type of case: Node omission
- Input: hdss-rf01-syntaxError5.json
- Expected value: Error: "Missing irrigation_basin_name"

#### HDSS-FN1-S-TC-6
- Type of case: Node omission
- Input: hdss-rf01-syntaxError6.json
- Expected value: Error: "Missing :"

#### HDSS-FN1-S-TC-7
- Type of case: Node omission
- Input: hdss-rf01-syntaxError7.json
- Expected value: Error: "Missing resource array"

#### HDSS-FN1-S-TC-8
- Type of case: Node omission
- Input: hdss-rf01-syntaxError8.json
- Expected value: Error: "Missing ["

#### HDSS-FN1-S-TC-9
- Type of case: Node omission
- Input: hdss-rf01-syntaxError9.json
- Expected value: Error: "Missing ]"

#### HDSS-FN1-S-TC-10
- Type of case: Node omission
- Input: hdss-rf01-syntaxError10.json
- Expected value: Error: "Missing resource name field"

#### HDSS-FN1-S-TC-11
- Type of case: Node omission
- Input: hdss-rf01-syntaxError11.json
- Expected value: Error: "Missing resource type field"

#### HDSS-FN1-S-TC-12
- Type of case: Node omission
- Input: hdss-rf01-syntaxError12.json
- Expected value: Error: "Missing resource capacity field"

#### HDSS-FN1-S-TC-13
- Type of case: Node omission
- Input: hdss-rf01-syntaxError13.json
- Expected value: Error: "Missing resource label"

#### HDSS-FN1-S-TC-14
- Type of case: Node omission
- Input: hdss-rf01-syntaxError14.json
- Expected value: Error: "Missing resource value"

#### HDSS-FN1-S-TC-15
- Type of case: Node omission
- Input: hdss-rf01-syntaxError15.json
- Expected value: Error: "Missing capacity value"

#### HDSS-FN1-S-TC-16
- Type of case: Node omission
- Input: hdss-rf01-syntaxError16.json
- Expected value: Error: "Missing ."

#### HDSS-FN1-S-TC-17
- Type of case: Node omission
- Input: hdss-rf01-syntaxError17.json
- Expected value: Error: "Missing ,"

#### HDSS-FN1-S-TC-18
- Type of case: Node omission
- Input: hdss-rf01-syntaxError18.json
- Expected value: Error: "Missing resource name value"

#### HDSS-FN1-S-TC-19
- Type of case: Node omission
- Input: hdss-rf01-syntaxError19.json
- Expected value: Error: "Missing left quotes"

#### HDSS-FN1-S-TC-20
- Type of case: Node omission
- Input: hdss-rf01-syntaxError20.json
- Expected value: Error: "Missing right quotes"

#### HDSS-FN1-S-TC-21
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError21.json
- Expected value: Error: "Repetition of {"

#### HDSS-FN1-S-TC-22
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError22.json
- Expected value: Error: "Repetition of }"

#### HDSS-FN1-S-TC-23
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError23.json
- Expected value: Error: "Repetition of file"

#### HDSS-FN1-S-TC-24
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError24.json
- Expected value: Error: "Repetition of body"

#### HDSS-FN1-S-TC-25
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError25.json
- Expected value: Error: "Repetition of irrigation_basin_name"

#### HDSS-FN1-S-TC-26
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError26.json
- Expected value: Error: "Repetition of :"

#### HDSS-FN1-S-TC-27
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError27.json
- Expected value: Error: "Repetition of resources array"

#### HDSS-FN1-S-TC-28
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError28.json
- Expected value: Error: "Repetition of ["

#### HDSS-FN1-S-TC-29
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError29.json
- Expected value: Error: "Repetition of ]"

#### HDSS-FN1-S-TC-30
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError30.json
- Expected value: Error: "Repetition of resource name"

#### HDSS-FN1-S-TC-31
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError31.json
- Expected value: Error: "Repetition of resource label"

#### HDSS-FN1-S-TC-32
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError32.json
- Expected value: Error: "Repetition of resource value"

#### HDSS-FN1-S-TC-33
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError33.json
- Expected value: Error: "Repetition of resource capacity value"

#### HDSS-FN1-S-TC-34
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError34.json
- Expected value: Error: "Repetition of ."

#### HDSS-FN1-S-TC-35
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError35.json
- Expected value: Error: "Repetition of ,"

#### HDSS-FN1-S-TC-36
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError36.json
- Expected value: Error: "Repetition of left quotes"

#### HDSS-FN1-S-TC-37
- Type of case: Node repetition
- Input: hdss-rf01-syntaxError37.json
- Expected value: Error: "Repetition of right quotes"

#### HDSS-FN1-S-TC-38
- Type of case: Node modification
- Input: hdss-rf01-syntaxError38.json
- Expected value: Error: "Modification of {"

#### HDSS-FN1-S-TC-39
- Type of case: Node modification
- Input: hdss-rf01-syntaxError39.json
- Expected value: Error: "Modification of }"

#### HDSS-FN1-S-TC-40
- Type of case: Node modification
- Input: hdss-rf01-syntaxError40.json
- Expected value: Error: "Modification of body"

#### HDSS-FN1-S-TC-41
- Type of case: Node modification
- Input: hdss-rf01-syntaxError41.json
- Expected value: Error: "Modification of :"

#### HDSS-FN1-S-TC-42
- Type of case: Node modification
- Input: hdss-rf01-syntaxError42.json
- Expected value: Error: "Modification of ["

#### HDSS-FN1-S-TC-43
- Type of case: Node modification
- Input: hdss-rf01-syntaxError43.json
- Expected value: Error: "Modification of ]"

#### HDSS-FN1-S-TC-44
- Type of case: Node modification
- Input: hdss-rf01-syntaxError44.json
- Expected value: Error: "Modification of left quotes"

#### HDSS-FN1-S-TC-45
- Type of case: Node modification
- Input: hdss-rf01-syntaxError45.json
- Expected value: Error: "Modification of right quotes"

#### HDSS-FN1-S-TC-46
- Type of case: Node modification
- Input: hdss-rf01-syntaxError46.json
- Expected value: Error: "Modification of name resource label"

#### HDSS-FN1-S-TC-47
- Type of case: Node modification
- Input: hdss-rf01-syntaxError47.json
- Expected value: Error: "Modification of type resource label"

#### HDSS-FN1-S-TC-48
- Type of case: Node modification
- Input: hdss-rf01-syntaxError48.json
- Expected value: Error: "Modification of type resource value"

#### HDSS-FN1-S-TC-49
- Type of case: Node modification
- Input: hdss-rf01-syntaxError49.json
- Expected value: Error: "Modification of capacity resource label"

#### HDSS-FN1-S-TC-50
- Type of case: Node modification
- Input: hdss-rf01-syntaxError50.json
- Expected value: Error: "Modification of ."

#### HDSS-FN1-S-TC-51
- Type of case: Node modification
- Input: hdss-rf01-syntaxError51.json
- Expected value: Error: "Modification of ,"

#### HDSS-FN1-S-TC-52
- Type of case: Valid case
- Input: hdss-rf01-correctFile.json
- Expected value: Error: "Valid file"


## HDSS-RF-02
### Equivalence classes
- Equivalence class: HDSS-FN2-EQ-1
  - Input:  Non existing filename
  - Result: Error. "An input data file is not found"

- Equivalence class: HDSS-FN2-EQ-2
  - Input: Valid filename "validRegisterHydricResourcesCase.json"
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-3
  - Input: Valid JSON file
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-4
  - Input: Non JSON format
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-5
  - Input: Empty file
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-6
  - Input: Non empty file
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-7
  - Input: Existing irrigation basin name
  - Result: Error. "Tried to record an irrigation basin with an existing name"

- Equivalence class: HDSS-FN2-EQ-8
  - Input: Non existing irrigation basin name
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-9
  - Input: Under 50 chars irrigation basin name "shortName"
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-10
  - Input: Over 50 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-11
  - Input: No irrigation basin name found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-12
  - Input: Two or more irrigation basin names found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-13
  - Input: One irrigation basin name found
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-14
  - Input: No resources list found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-15
  - Input: Two or more resources lists found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-16
  - Input: One resources list found
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-17
  - Input: Existing resource name
  - Result: Error. "Tried to record a resource basin with an existing name"

- Equivalence class: HDSS-FN2-EQ-18
  - Input: Non existing resource name
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-19
  - Input: Under 50 chars resource basin name "shortName"
  - Result: valid case

- Equivalence class: HDSS-FN2-EQ-20
  - Input: Over 50 chars resource name "reallyreallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-21
  - Input: No resource name found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-22
  - Input: Two or more resource names found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-23
  - Input: One resource basin name found
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-24
  - Input: Resource type value = "Reservoir"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-25
  - Input: Resource type value = "Desalination plant"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-26
  - Input: Resource type value = "Aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-27
  - Input: Resource type value = "My mom"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-28
  - Input: No resource type found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-29
  - Input: Two or more resource types found
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-30
  - Input: One resource basin type found
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-31
  - Input: Negative capacity
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-32
  - Input: Positive capacity
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-33
  - Input: Capacity values is not a number "word"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-34
  - Input: Capacity values is a number "2.23"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-35
  - Input: Capacity values is a number with more than 2 decimals "2.231"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-36
  - Input: Capacity values is a number with 2 or less decimals "2.23"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-37
  - Input: No capacity found and resource type is not "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-38
  - Input: Two or more capacity values found and resource type is not "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-39
  - Input: One capacity value found and resource type is not "aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-40
  - Input: No capacity found and resource type is "aquifer"
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-41
  - Input: One or more capacity values found and resource type is "aquifer"
  - Result: Error: "The input file has no data or does not match the expected format"

- Equivalence class: HDSS-FN2-EQ-42
  - Input: One "reservoir" resource over 90% of capacity (PLENTY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-43
  - Input: One "desalination plant" resource over 90% of capacity (PLENTY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-44
  - Input: One "aquifer" resource over sea level capacity (PLENTY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-45
  - Input: One resource of each type with capacities over 90% (PLENTY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-46
  - Input: One "reservoir" resource between 40% and 90% of capacity (NORMALITY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-47
  - Input: One "desalination plant" resource between 40% and 90% of capacity (NORMALITY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-48
  - Input: One "aquifer" resource between -8 meters and sea level (NORMALITY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-49
  - Input: One resource of each type with capacities between 40% and 90% (NORMALITY)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-50
  - Input: One "reservoir" resource with capacity below 40% (SHORTAGE)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-51
  - Input: One "desalination plant" resource with capacity below 40% (SHORTAGE)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-52
  - Input: One "aquifer" resource with level below -8 meters (SHORTAGE)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-53
  - Input: One resource of each type with capacities below 40% (SHORTAGE)
  - Result: Valid case

- Equivalence class: HDSS-FN2-EQ-54
  - Input: One "reservoir" type with percentage over 100%
  - Result: Error: "The input file has no data or does not match the expected format"

### Boundary limits
- Boundary limit: HDSS-FN2-BL-1
  - Input: 49 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongNam"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-2
  - Input: 50 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-3
  - Input: 51 chars irrigation basin name "reallyreallyreallyreallyreallyreallyreallyLongNamee"
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN2-BL-4
  - Input: 49 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongNam"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-5
  - Input: 50 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongName"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-6
  - Input: 51 chars resource name "reallyreallyreallyreallyreallyreallyreallyLongNamee"
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN2-BL-7
  - Input: Capacity value 0.00
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-8
  - Input: Capacity value 0.01
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-9
  - Input: Capacity value -0.01
  - Result: Error: "The input file has no data or does not match the expected format"

- Boundary limit: HDSS-FN2-BL-10
  - Input capacity: capacity with 2 decimals "2.23"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-11
  - Input capacity: capacity with 1 decimal "2.2"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-12
  - Input capacity: capacity with no decimals "2"
  - Result: valid case

- Boundary limit: HDSS-FN2-BL-13
  - Input capacity: capacity with 3 decimal "2.223"
  - Result: Error: "The input file has no data or does not match the expected format"

### Test cases
#### HDSS-FN2-TC-1
- Equivalence classes considered:   HDSS-FN2-EQ-2, HDSS-FN2-EQ-3, HDSS-FN2-EQ-6, HDSS-FN2-EQ-8, HDSS-FN2-EQ-9, HDSS-FN2-EQ-13, HDSS-FN2-EQ-16, HDSS-FN2-EQ-18, HDSS-FN2-EQ-19, HDSS-FN2-EQ-23, HDSS-FN2-EQ-24, HDSS-FN2-EQ-25, HDSS-FN2-EQ-26, HDSS-FN2-EQ-30, HDSS-FN2-EQ-32, HDSS-FN2-EQ-34, HDSS-FN2-EQ-36, HDSS-FN2-EQ-39, HDSS-FN2-EQ-40
- Input:
  - Filename: "hdss-rf02-validRegisterHydricResourcesCase.json"
  - Expected output: "hdss-rf02-expectedValidRegisterHydricResourcesCase.json"

#### HDSS-FN2-TC-2
- Equivalence class considered: HDSS-FN2-EQ-1
- Input:
  - Filename "nonexists.json"
  - Expected output: Throws Exception. Error message: "An input data file is not found"

#### HDSS-FN2-TC-3
- Boundary limit considered: HDSS-FN2-BL-7
- Input:
  - Filename "hdss-rf02-capacityZero.json"
  - Expected output: "hdss-rf02-expectedCapacityZero.json"

#### HDSS-FN2-TC-4
- Equivalence class considered: HDSS-FN2-EQ-4
- Input:
  - Filename "hdss-rf02-invalidJson.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-5
- Equivalence class considered: HDSS-FN2-EQ-5
- Input:
  - Filename "hdss-rf02-empty.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-6
- Equivalence class considered: HDSS-FN2-EQ-7
- Input:
  - Filename "hdss-rf02-existingIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "Tried to record an irrigation basin with an existing name"

#### HDSS-FN2-TC-7
- Equivalence class considered: HDSS-FN2-EQ-10
- Input:
  - Filename "hdss-rf02-longIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-8
- Equivalence class considered: HDSS-FN2-EQ-11
- Input:
  - Filename "hdss-rf02-noIrrigationBasinName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-9
- Equivalence class considered: HDSS-FN2-EQ-12
- Input:
  - Filename "hdss-rf02-severalIrrigationBasinNames.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-10
- Equivalence class considered: HDSS-FN2-EQ-14
- Input:
  - Filename "hdss-rf02-noResourcesList.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-11
- Equivalence class considered: HDSS-FN2-EQ-15
- Input:
  - Filename "hdss-rf02-severalResourcesLists.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-12
- Equivalence class considered: HDSS-FN2-EQ-17
- Input:
  - Filename "hdss-rf02-existingResourceName.json"
  - Expected output: Throws Exception. Error message: "Tried to record a resource basin with an existing name"

#### HDSS-FN2-TC-13
- Equivalence class considered: HDSS-FN2-EQ-20
- Input:
  - Filename "hdss-rf02-longResourceName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-14
- Equivalence class considered: HDSS-FN2-EQ-21
- Input:
  - Filename "hdss-rf02-noResourceName.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-15
- Equivalence class considered: HDSS-FN2-EQ-22
- Input:
  - Filename "hdss-rf02-severalResourceNames.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-16
- Equivalence class considered: HDSS-FN2-EQ-27
- Input:
  - Filename "hdss-rf02-invalidResourceType.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-17
- Equivalence class considered: HDSS-FN2-EQ-28
- Input:
  - Filename "hdss-rf02-noResourceType.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-18
- Equivalence class considered: HDSS-FN2-EQ-29
- Input:
  - Filename "hdss-rf02-severalResourceTypes.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-19
- Equivalence class considered: HDSS-FN2-EQ-31
- Input:
  - Filename "hdss-rf02-negativeResourceCapacity.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-20
- Equivalence class considered: HDSS-FN2-EQ-33
- Input:
  - Filename "hdss-rf02-notValidResourceCapacity.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-21
- Equivalence class considered: HDSS-FN2-EQ-35
- Input:
  - Filename "hdss-rf02-notValidResourceCapacityDecimalFormat.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-22
- Equivalence class considered: HDSS-FN2-EQ-37
- Input:
  - Filename "hdss-rf02-noCapacityNotAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-23
- Equivalence class considered: HDSS-FN2-EQ-38
- Input:
  - Filename "hdss-rf02-severalCapacityValuesNotAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-24
- Equivalence class considered: HDSS-FN2-EQ-41
- Input:
  - Filename "hdss-rf02-capacityFoundAquifer.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-25
- Boundary limit considered: HDSS-FN2-BL-1
- Input:
  - Filename "hdss-rf02-validIrrigationBasinName49.json"
  - Expected output: "hdss-rf02-expectedValidIrrigationBasinName49.json"

#### HDSS-FN2-TC-26
- Boundary limit considered: HDSS-FN2-BL-2
- Input:
   - Filename "hdss-rf02-validIrrigationBasinName50.json"
   - Expected output: "hdss-rf02-expectedValidIrrigationBasinName50.json"

#### HDSS-FN2-TC-27
- Boundary limit considered: HDSS-FN2-BL-3
- Input:
   - Filename "hdss-rf02-invalidIrrigationBasinName.json"
   - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-28
- Boundary limit considered: HDSS-FN2-BL-4
- Input:
   - Filename "hdss-rf02-validResourceName49.json"
   - Expected output: "hdss-rf02-expectedValidResourceName49.json"

#### HDSS-FN2-TC-29
- Boundary limit considered: HDSS-FN2-BL-5
- Input:
   - Filename "hdss-rf02-validResourceName50.json"
   - Expected output: "hdss-rf02-expectedValidResourceName50.json"

#### HDSS-FN2-TC-30
- Boundary limit considered: HDSS-FN2-BL-6
- Input:
   - Filename "hdss-rf02-invalidResourceName.json"
   - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-31
- Boundary limit considered: HDSS-FN2-BL-8
- Input:
   - Filename "hdss-rf02-validResourceCapacity0_01.json"
   - Expected output: "hdss-rf02-expectedValidResourceCapacity0_01.json"

#### HDSS-FN2-TC-32
- Boundary limit considered: HDSS-FN2-BL-9
- Input:
   - Filename "hdss-rf02-invalidResourceCapacity.json"
   - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-33
- Boundary limit considered: HDSS-FN2-BL-10
- Input:
   - Filename "hdss-rf02-validResourceCapacityTwoDecimals.json"
   - Expected output: "hdss-rf02-expectedValidResourceCapacityTwoDecimals.json"

#### HDSS-FN2-TC-34
- Boundary limit considered: HDSS-FN2-BL-11
- Input:
   - Filename "hdss-rf02-validResourceCapacityOneDecimal.json"
   - Expected output: "hdss-rf02-expectedValidResourceCapacityOneDecimal.json"

#### HDSS-FN2-TC-35
- Boundary limit considered: HDSS-FN2-BL-12
- Input:
   - Filename "hdss-rf02-validResourceCapacityZeroDecimals.json"
   - Expected output: "hdss-rf02-expectedValidResourceCapacityZeroDecimals.json"

#### HDSS-FN2-TC-36
- Boundary limit considered: HDSS-FN2-BL-13
- Input:
   - Filename "hdss-rf02-invalidResourceCapacityThreeDecimals.json"
   - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"

#### HDSS-FN2-TC-37
- Equivalence class considered: HDSS-FN2-EQ-42
- Input:
  - Filename "hdss-rf02-validPlentyResources.json"
  - Expected output: "hdss-rf02-expectedValidPlentyReservoir.json"

#### HDSS-FN2-TC-38
- Equivalence class considered: HDSS-FN2-EQ-43
- Input:
  - Filename "hdss-rf02-validPlentyResources.json"
  - Expected output: "hdss-rf02-expectedValidPlentyDesalinationPlant.json"

#### HDSS-FN2-TC-39
- Equivalence class considered: HDSS-FN2-EQ-44
- Input:
  - Filename "hdss-rf02-validPlentyResources.json"
  - Expected output: "hdss-rf02-expectedValidPlentyAquifer.json"

#### HDSS-FN2-TC-40
- Equivalence class considered: HDSS-FN2-EQ-45
- Input:
  - Filename "hdss-rf02-validPlentyResources.json"
  - Expected output: "hdss-rf02-expectedValidPlentyAll.json"

#### HDSS-FN2-TC-41
- Equivalence class considered: HDSS-FN2-EQ-46
- Input:
  - Filename "hdss-rf02-validNormalityResources.json"
  - Expected output: "hdss-rf02-expectedValidNormalityReservoir.json"

#### HDSS-FN2-TC-42
- Equivalence class considered: HDSS-FN2-EQ-47
- Input:
  - Filename "hdss-rf02-validNormalityResources.json"
  - Expected output: "hdss-rf02-expectedValidNormalityDesalinationPlant.json"

#### HDSS-FN2-TC-43
- Equivalence class considered: HDSS-FN2-EQ-48
- Input:
  - Filename "hdss-rf02-validNormalityResources.json"
  - Expected output: "hdss-rf02-expectedValidNormalityAquifer.json"

#### HDSS-FN2-TC-44
- Equivalence class considered: HDSS-FN2-EQ-49
- Input:
  - Filename "hdss-rf02-validNormalityResources.json"
  - Expected output: "hdss-rf02-expectedValidNormalityAll.json"

#### HDSS-FN2-TC-45
- Equivalence class considered: HDSS-FN2-EQ-50
- Input:
  - Filename "hdss-rf02-validShortageResources.json"
  - Expected output: "hdss-rf02-expectedValidShortageReservoir.json"

#### HDSS-FN2-TC-46
- Equivalence class considered: HDSS-FN2-EQ-51
- Input:
  - Filename "hdss-rf02-validShortageResources.json"
  - Expected output: "hdss-rf02-expectedValidShortageDesalinationPlant.json"

#### HDSS-FN2-TC-47
- Equivalence class considered: HDSS-FN2-EQ-52
- Input:
  - Filename "hdss-rf02-validShortageResources.json"
  - Expected output: "hdss-rf02-expectedValidShortageAquifer.json"

#### HDSS-FN2-TC-48
- Equivalence class considered: HDSS-FN2-EQ-53
- Input:
  - Filename "hdss-rf02-validShortageResources.json"
  - Expected output: "hdss-rf02-expectedValidShortageAll.json"

#### HDSS-FN2-TC-49
- Equivalence class considered: HDSS-FN2-EQ-54
- Input:
  - Filename "hdss-rf02-invalidCapacityResources.json"
  - Expected output: Throws Exception. Error message: "The input file has no data or does not match the expected format"


## HDSS-RF-03
### Syntax analysis
- **File::=** Init_Object Body End_Object
- **Body::=** Drainage_Basin Fields_Separator Requester Fields_Separator State Fields_Separator Amount Fields_Separator Irrigation_Date
- **Drainage_Basin::=** Quotes Drainage_Basin_Label Quotes Label_Value_Separator Quotes Drainage_Basin_Value Quotes
- **Requester::=** Quotes Requester_Label Quotes Label_Value_Separator Quotes Requester_Value Quotes
- **State::=** Quotes State_Label Quotes Label_Value_Separator Quotes State_Value Quotes
- **Amount::=** Quotes Amount_Label Quotes Label_Value_Separator Amount_Value
- **Irrigation_Date::=** Quotes Irrigation_Date_Label Quotes Label_Value_Separator Quotes Irrigation_Date_Value Quotes
- **Drainage_Basin_Label::=** 'Drainage Basin'
- **Requester_Label::=** 'Requester'
- **State_Label::=** 'State'
- **Amount_Label::=** 'Amount'
- **Irrigation_Date_Label::=** 'Irrigation Date'
- **Drainage_Basin_Value::=** 1[Character]50
- **Requester_Value::=** 1{Character}50
- **State_Value::=** 'PLENTY'|'NORMALITY'|'SHORTAGE'
- **Amount_Value::=** 1{Number}n Point 2{Number}2
- **Irrigation_Date_Value::=** Date Hyphen Hour

- **Date::=** '0'|'1'|'2'|'3' Number Bar '0'|'1' Number Bar 2{Number}2
- **Hour::=** '0'|'1'|'2' Number Label_Value_Separator '0'|'1'|'2'|'3'|'4'|'5' Number

- **Fields_Separator::=**','
- **Label_Value_Separator::=**':'
- **Init_Object::=**'{'
- **End_Object::=**'}'

- **Quotes::=** '"'
- **Bar::=** '/'
- **Hyphen::=** '-'
- **Point::=** '.'

- **Character::=**'a'|'b'|'c'|...|'z'
- **Number::=**'0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'

### Derivation trees
#### Derivation tree 1
![](img/FN3/DerivationTreeFN3-01.png?raw=true)
#### Derivation tree 2
![](img/FN3/DerivationTreeFN3-02.png?raw=true)
#### Derivation tree 3
![](img/FN3/DerivationTreeFN3-03.png?raw=true)
#### Derivation tree 4
![](img/FN3/DerivationTreeFN3-04.png?raw=true)
#### Derivation tree 5
![](img/FN3/DerivationTreeFN3-05.png?raw=true)
#### Derivation tree 6
![](img/FN3/DerivationTreeFN3-06.png?raw=true)
#### Derivation tree 7
![](img/FN3/DerivationTreeFN3-07.png?raw=true)
#### Derivation tree 8
![](img/FN3/DerivationTreeFN3-08.png?raw=true)

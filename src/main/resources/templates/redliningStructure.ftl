<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:typ="http://xmlns.oracle.com/apps/scm/productCollaboration/changes/changeObjects/changeObjectService/types/" xmlns:str="http://xmlns.oracle.com/apps/scm/productModel/items/structures/structureServiceV2/" xmlns:sub="http://xmlns.oracle.com/apps/scm/productModel/items/structures/flex/substituteComponent/" xmlns:ref="http://xmlns.oracle.com/apps/scm/productModel/items/structures/flex/referenceDesignator/" xmlns:com="http://xmlns.oracle.com/apps/scm/productModel/items/structures/flex/component/" xmlns:str1="http://xmlns.oracle.com/apps/scm/productModel/items/structures/flex/structureHeader/">
   <soapenv:Header/>
   <soapenv:Body>
      <typ:redlineItemStructure>
         <typ:changeNotice>${changeNotice}</typ:changeNotice>
         <typ:organizationCode>${organizationCode}</typ:organizationCode>
         <typ:sequenceNumber>${sequenceNumber}</typ:sequenceNumber>
         <typ:structureAttrList>
            <str:StructureName>${StructureName}</str:StructureName>
            <str:Component>
               <str:ComponentItemNumber>${structureNumber}</str:ComponentItemNumber>
               <str:ACDTypeValue>${ACDTypeValue}</str:ACDTypeValue>
               <str:Quantity unitCode="EA">${structureQuantity}</str:Quantity>
            </str:Component>
         </typ:structureAttrList>
         <typ:isSyncMode>false</typ:isSyncMode>
      </typ:redlineItemStructure>
   </soapenv:Body>
</soapenv:Envelope>
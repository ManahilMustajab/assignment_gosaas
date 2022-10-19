<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns1:createOrUpdateChangeObject xmlns:ns1="http://xmlns.oracle.com/apps/scm/productCollaboration/changes/changeObjects/changeObjectService/types/" xmlns:ns12="http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/categories/" xmlns:ns3="http://xmlns.oracle.com/apps/scm/productModel/items/itemServiceV2/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
         <ns1:changeObject xmlns:ns2="http://xmlns.oracle.com/apps/scm/productCollaboration/changes/changeObjects/changeObjectService/" xmlns:ns19="http://xmlns.oracle.com/apps/scm/productCatalogManagement/changeManagement/flex/changeObjectDff/">
             <ns2:ChangeNotice>${changeNotice}</ns2:ChangeNotice>
            <ns2:OrganizationCode>${organizationCode}</ns2:OrganizationCode>
            <ns2:AffectedObject xmlns:ns8="http://xmlns.oracle.com/apps/scm/productCatalogManagement/changeManagement/flex/changeLineDff/">
               <ns2:Item>
                  <ns3:ItemNumber>${affectedItemNumber}</ns3:ItemNumber>
                  <ns3:ChangeNotice>${changeNotice}</ns3:ChangeNotice>
               </ns2:Item>
            </ns2:AffectedObject>
         </ns1:changeObject>
      </ns1:createOrUpdateChangeObject>
   </soap:Body>
</soap:Envelope>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns1:createOrUpdateChangeObject xmlns:ns1="http://xmlns.oracle.com/apps/scm/productCollaboration/changes/changeObjects/changeObjectService/types/" xmlns:ns12="http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/categories/" xmlns:ns3="http://xmlns.oracle.com/apps/scm/productModel/items/itemServiceV2/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
         <ns1:changeObject xmlns:ns2="http://xmlns.oracle.com/apps/scm/productCollaboration/changes/changeObjects/changeObjectService/">
            <ns2:ChangeNotice>${changeNotice}</ns2:ChangeNotice>
            <ns2:ChangeTypeValue>ECO</ns2:ChangeTypeValue>
            <ns2:OrganizationCode>${organizationCode}</ns2:OrganizationCode>
            <ns2:ChangeName>${changeName}</ns2:ChangeName>
            <ns2:Description>${changeDescription}</ns2:Description>
         </ns1:changeObject>
      </ns1:createOrUpdateChangeObject>
   </soap:Body>
</soap:Envelope>
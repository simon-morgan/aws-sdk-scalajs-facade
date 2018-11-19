package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object apigateway {
  type ApiKeySourceType = String
  type ApiKeysFormat = String
  type AuthorizerType = String
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CacheClusterSize = String
  type CacheClusterStatus = String
  type ConnectionType = String
  type ContentHandlingStrategy = String
  type DocumentationPartLocationStatusCode = String
  type DocumentationPartType = String
  type EndpointType = String
  type GatewayResponseType = String
  type IntegrationType = String
  type ListOfARNs = js.Array[ProviderARN]
  type ListOfApiKey = js.Array[ApiKey]
  type ListOfApiStage = js.Array[ApiStage]
  type ListOfAuthorizer = js.Array[Authorizer]
  type ListOfBasePathMapping = js.Array[BasePathMapping]
  type ListOfClientCertificate = js.Array[ClientCertificate]
  type ListOfDeployment = js.Array[Deployment]
  type ListOfDocumentationPart = js.Array[DocumentationPart]
  type ListOfDocumentationVersion = js.Array[DocumentationVersion]
  type ListOfDomainName = js.Array[DomainName]
  type ListOfEndpointType = js.Array[EndpointType]
  type ListOfGatewayResponse = js.Array[GatewayResponse]
  type ListOfLong = js.Array[Double]
  type ListOfModel = js.Array[Model]
  type ListOfPatchOperation = js.Array[PatchOperation]
  type ListOfRequestValidator = js.Array[RequestValidator]
  type ListOfResource = js.Array[Resource]
  type ListOfRestApi = js.Array[RestApi]
  type ListOfSdkConfigurationProperty = js.Array[SdkConfigurationProperty]
  type ListOfSdkType = js.Array[SdkType]
  type ListOfStage = js.Array[Stage]
  type ListOfStageKeys = js.Array[StageKey]
  type ListOfString = js.Array[String]
  type ListOfUsage = js.Array[ListOfLong]
  type ListOfUsagePlan = js.Array[UsagePlan]
  type ListOfUsagePlanKey = js.Array[UsagePlanKey]
  type ListOfVpcLink = js.Array[VpcLink]
  type LocationStatusType = String
  type MapOfApiStageThrottleSettings = js.Dictionary[ThrottleSettings]
  type MapOfIntegrationResponse = js.Dictionary[IntegrationResponse]
  type MapOfKeyUsages = js.Dictionary[ListOfUsage]
  type MapOfMethod = js.Dictionary[Method]
  type MapOfMethodResponse = js.Dictionary[MethodResponse]
  type MapOfMethodSettings = js.Dictionary[MethodSetting]
  type MapOfMethodSnapshot = js.Dictionary[MethodSnapshot]
  type MapOfStringToBoolean = js.Dictionary[NullableBoolean]
  type MapOfStringToList = js.Dictionary[ListOfString]
  type MapOfStringToString = js.Dictionary[String]
  type NullableBoolean = Boolean
  type NullableInteger = Int
  type Op = String
  type PathToMapOfMethodSnapshot = js.Dictionary[MapOfMethodSnapshot]
  type ProviderARN = String
  type PutMode = String
  type QuotaPeriodType = String
  type StatusCode = String
  type Timestamp = js.Date
  type UnauthorizedCacheControlHeaderStrategy = String
  type VpcLinkStatus = String
}

package apigateway {
  @js.native
  @JSImport("aws-sdk", "APIGateway")
  class APIGateway(config: AWSConfig) extends js.Object {
    def createApiKey(params: CreateApiKeyRequest): Request[ApiKey] = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[Authorizer] = js.native
    def createBasePathMapping(params: CreateBasePathMappingRequest): Request[BasePathMapping] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[Deployment] = js.native
    def createDocumentationPart(params: CreateDocumentationPartRequest): Request[DocumentationPart] = js.native
    def createDocumentationVersion(params: CreateDocumentationVersionRequest): Request[DocumentationVersion] = js.native
    def createDomainName(params: CreateDomainNameRequest): Request[DomainName] = js.native
    def createModel(params: CreateModelRequest): Request[Model] = js.native
    def createRequestValidator(params: CreateRequestValidatorRequest): Request[RequestValidator] = js.native
    def createResource(params: CreateResourceRequest): Request[Resource] = js.native
    def createRestApi(params: CreateRestApiRequest): Request[RestApi] = js.native
    def createStage(params: CreateStageRequest): Request[Stage] = js.native
    def createUsagePlan(params: CreateUsagePlanRequest): Request[UsagePlan] = js.native
    def createUsagePlanKey(params: CreateUsagePlanKeyRequest): Request[UsagePlanKey] = js.native
    def createVpcLink(params: CreateVpcLinkRequest): Request[VpcLink] = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[js.Object] = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object] = js.native
    def deleteBasePathMapping(params: DeleteBasePathMappingRequest): Request[js.Object] = js.native
    def deleteClientCertificate(params: DeleteClientCertificateRequest): Request[js.Object] = js.native
    def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object] = js.native
    def deleteDocumentationPart(params: DeleteDocumentationPartRequest): Request[js.Object] = js.native
    def deleteDocumentationVersion(params: DeleteDocumentationVersionRequest): Request[js.Object] = js.native
    def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object] = js.native
    def deleteGatewayResponse(params: DeleteGatewayResponseRequest): Request[js.Object] = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object] = js.native
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object] = js.native
    def deleteMethod(params: DeleteMethodRequest): Request[js.Object] = js.native
    def deleteMethodResponse(params: DeleteMethodResponseRequest): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object] = js.native
    def deleteRequestValidator(params: DeleteRequestValidatorRequest): Request[js.Object] = js.native
    def deleteResource(params: DeleteResourceRequest): Request[js.Object] = js.native
    def deleteRestApi(params: DeleteRestApiRequest): Request[js.Object] = js.native
    def deleteStage(params: DeleteStageRequest): Request[js.Object] = js.native
    def deleteUsagePlan(params: DeleteUsagePlanRequest): Request[js.Object] = js.native
    def deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest): Request[js.Object] = js.native
    def deleteVpcLink(params: DeleteVpcLinkRequest): Request[js.Object] = js.native
    def flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest): Request[js.Object] = js.native
    def flushStageCache(params: FlushStageCacheRequest): Request[js.Object] = js.native
    def generateClientCertificate(params: GenerateClientCertificateRequest): Request[ClientCertificate] = js.native
    def getAccount(params: GetAccountRequest): Request[Account] = js.native
    def getApiKey(params: GetApiKeyRequest): Request[ApiKey] = js.native
    def getApiKeys(params: GetApiKeysRequest): Request[ApiKeys] = js.native
    def getAuthorizer(params: GetAuthorizerRequest): Request[Authorizer] = js.native
    def getAuthorizers(params: GetAuthorizersRequest): Request[Authorizers] = js.native
    def getBasePathMapping(params: GetBasePathMappingRequest): Request[BasePathMapping] = js.native
    def getBasePathMappings(params: GetBasePathMappingsRequest): Request[BasePathMappings] = js.native
    def getClientCertificate(params: GetClientCertificateRequest): Request[ClientCertificate] = js.native
    def getClientCertificates(params: GetClientCertificatesRequest): Request[ClientCertificates] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[Deployment] = js.native
    def getDeployments(params: GetDeploymentsRequest): Request[Deployments] = js.native
    def getDocumentationPart(params: GetDocumentationPartRequest): Request[DocumentationPart] = js.native
    def getDocumentationParts(params: GetDocumentationPartsRequest): Request[DocumentationParts] = js.native
    def getDocumentationVersion(params: GetDocumentationVersionRequest): Request[DocumentationVersion] = js.native
    def getDocumentationVersions(params: GetDocumentationVersionsRequest): Request[DocumentationVersions] = js.native
    def getDomainName(params: GetDomainNameRequest): Request[DomainName] = js.native
    def getDomainNames(params: GetDomainNamesRequest): Request[DomainNames] = js.native
    def getExport(params: GetExportRequest): Request[ExportResponse] = js.native
    def getGatewayResponse(params: GetGatewayResponseRequest): Request[GatewayResponse] = js.native
    def getGatewayResponses(params: GetGatewayResponsesRequest): Request[GatewayResponses] = js.native
    def getIntegration(params: GetIntegrationRequest): Request[Integration] = js.native
    def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[IntegrationResponse] = js.native
    def getMethod(params: GetMethodRequest): Request[Method] = js.native
    def getMethodResponse(params: GetMethodResponseRequest): Request[MethodResponse] = js.native
    def getModel(params: GetModelRequest): Request[Model] = js.native
    def getModelTemplate(params: GetModelTemplateRequest): Request[Template] = js.native
    def getModels(params: GetModelsRequest): Request[Models] = js.native
    def getRequestValidator(params: GetRequestValidatorRequest): Request[RequestValidator] = js.native
    def getRequestValidators(params: GetRequestValidatorsRequest): Request[RequestValidators] = js.native
    def getResource(params: GetResourceRequest): Request[Resource] = js.native
    def getResources(params: GetResourcesRequest): Request[Resources] = js.native
    def getRestApi(params: GetRestApiRequest): Request[RestApi] = js.native
    def getRestApis(params: GetRestApisRequest): Request[RestApis] = js.native
    def getSdk(params: GetSdkRequest): Request[SdkResponse] = js.native
    def getSdkType(params: GetSdkTypeRequest): Request[SdkType] = js.native
    def getSdkTypes(params: GetSdkTypesRequest): Request[SdkTypes] = js.native
    def getStage(params: GetStageRequest): Request[Stage] = js.native
    def getStages(params: GetStagesRequest): Request[Stages] = js.native
    def getTags(params: GetTagsRequest): Request[Tags] = js.native
    def getUsage(params: GetUsageRequest): Request[Usage] = js.native
    def getUsagePlan(params: GetUsagePlanRequest): Request[UsagePlan] = js.native
    def getUsagePlanKey(params: GetUsagePlanKeyRequest): Request[UsagePlanKey] = js.native
    def getUsagePlanKeys(params: GetUsagePlanKeysRequest): Request[UsagePlanKeys] = js.native
    def getUsagePlans(params: GetUsagePlansRequest): Request[UsagePlans] = js.native
    def getVpcLink(params: GetVpcLinkRequest): Request[VpcLink] = js.native
    def getVpcLinks(params: GetVpcLinksRequest): Request[VpcLinks] = js.native
    def importApiKeys(params: ImportApiKeysRequest): Request[ApiKeyIds] = js.native
    def importDocumentationParts(params: ImportDocumentationPartsRequest): Request[DocumentationPartIds] = js.native
    def importRestApi(params: ImportRestApiRequest): Request[RestApi] = js.native
    def putGatewayResponse(params: PutGatewayResponseRequest): Request[GatewayResponse] = js.native
    def putIntegration(params: PutIntegrationRequest): Request[Integration] = js.native
    def putIntegrationResponse(params: PutIntegrationResponseRequest): Request[IntegrationResponse] = js.native
    def putMethod(params: PutMethodRequest): Request[Method] = js.native
    def putMethodResponse(params: PutMethodResponseRequest): Request[MethodResponse] = js.native
    def putRestApi(params: PutRestApiRequest): Request[RestApi] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse] = js.native
    def testInvokeMethod(params: TestInvokeMethodRequest): Request[TestInvokeMethodResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAccount(params: UpdateAccountRequest): Request[Account] = js.native
    def updateApiKey(params: UpdateApiKeyRequest): Request[ApiKey] = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[Authorizer] = js.native
    def updateBasePathMapping(params: UpdateBasePathMappingRequest): Request[BasePathMapping] = js.native
    def updateClientCertificate(params: UpdateClientCertificateRequest): Request[ClientCertificate] = js.native
    def updateDeployment(params: UpdateDeploymentRequest): Request[Deployment] = js.native
    def updateDocumentationPart(params: UpdateDocumentationPartRequest): Request[DocumentationPart] = js.native
    def updateDocumentationVersion(params: UpdateDocumentationVersionRequest): Request[DocumentationVersion] = js.native
    def updateDomainName(params: UpdateDomainNameRequest): Request[DomainName] = js.native
    def updateGatewayResponse(params: UpdateGatewayResponseRequest): Request[GatewayResponse] = js.native
    def updateIntegration(params: UpdateIntegrationRequest): Request[Integration] = js.native
    def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): Request[IntegrationResponse] = js.native
    def updateMethod(params: UpdateMethodRequest): Request[Method] = js.native
    def updateMethodResponse(params: UpdateMethodResponseRequest): Request[MethodResponse] = js.native
    def updateModel(params: UpdateModelRequest): Request[Model] = js.native
    def updateRequestValidator(params: UpdateRequestValidatorRequest): Request[RequestValidator] = js.native
    def updateResource(params: UpdateResourceRequest): Request[Resource] = js.native
    def updateRestApi(params: UpdateRestApiRequest): Request[RestApi] = js.native
    def updateStage(params: UpdateStageRequest): Request[Stage] = js.native
    def updateUsage(params: UpdateUsageRequest): Request[Usage] = js.native
    def updateUsagePlan(params: UpdateUsagePlanRequest): Request[UsagePlan] = js.native
    def updateVpcLink(params: UpdateVpcLinkRequest): Request[VpcLink] = js.native
  }

  /**
   * <p>Access log settings, including the access log format and access log destination ARN.</p>
   */
  @js.native
  trait AccessLogSettings extends js.Object {
    var format: js.UndefOr[String]
    var destinationArn: js.UndefOr[String]
  }

  object AccessLogSettings {
    def apply(
      format: js.UndefOr[String] = js.undefined,
      destinationArn: js.UndefOr[String] = js.undefined): AccessLogSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "format" -> format.map { x => x.asInstanceOf[js.Any] },
        "destinationArn" -> destinationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessLogSettings]
    }
  }

  /**
   * <p>Represents an AWS account that is associated with API Gateway.</p> <div class="remarks"> <p>To view the account info, call <code>GET</code> on this resource.</p> <h4>Error Codes</h4> <p>The following exception may be thrown when the request fails.</p> <ul> <li>UnauthorizedException</li> <li>NotFoundException</li> <li>TooManyRequestsException</li> </ul> <p>For detailed error code information, including the corresponding HTTP Status Codes, see <a href="https://docs.aws.amazon.com/apigateway/api-reference/handling-errors/#api-error-codes">API Gateway Error Codes</a></p> <h4>Example: Get the information about an account.</h4> <h5>Request</h5> <pre><code>GET /account HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160531T184618Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code></pre> <h5>Response</h5> <p>The successful response returns a <code>200 OK</code> status code and a payload similar to the following:</p> <pre><code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/account-apigateway-{rel}.html", "name": "account", "templated": true }, "self": { "href": "/account" }, "account:update": { "href": "/account" } }, "cloudwatchRoleArn": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "throttleSettings": { "rateLimit": 500, "burstLimit": 1000 } } </code></pre> <p>In addition to making the REST API call directly, you can use the AWS CLI and an AWS SDK to access this resource.</p> </div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-limits.html">API Gateway Limits</a> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html">Developer Guide</a>, <a href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-account.html">AWS CLI</a> </div>
   */
  @js.native
  trait Account extends js.Object {
    var cloudwatchRoleArn: js.UndefOr[String]
    var throttleSettings: js.UndefOr[ThrottleSettings]
    var features: js.UndefOr[ListOfString]
    var apiKeyVersion: js.UndefOr[String]
  }

  object Account {
    def apply(
      cloudwatchRoleArn: js.UndefOr[String] = js.undefined,
      throttleSettings: js.UndefOr[ThrottleSettings] = js.undefined,
      features: js.UndefOr[ListOfString] = js.undefined,
      apiKeyVersion: js.UndefOr[String] = js.undefined): Account = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cloudwatchRoleArn" -> cloudwatchRoleArn.map { x => x.asInstanceOf[js.Any] },
        "throttleSettings" -> throttleSettings.map { x => x.asInstanceOf[js.Any] },
        "features" -> features.map { x => x.asInstanceOf[js.Any] },
        "apiKeyVersion" -> apiKeyVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Account]
    }
  }

  /**
   * <p>A resource that can be distributed to callers for executing <a>Method</a> resources that require an API key. API keys can be mapped to any <a>Stage</a> on any <a>RestApi</a>, which indicates that the callers with the API key can make requests to that stage.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html">Use API Keys</a> </div>
   */
  @js.native
  trait ApiKey extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var enabled: js.UndefOr[Boolean]
    var customerId: js.UndefOr[String]
    var id: js.UndefOr[String]
    var stageKeys: js.UndefOr[ListOfString]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var value: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
  }

  object ApiKey {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      enabled: js.UndefOr[Boolean] = js.undefined,
      customerId: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      stageKeys: js.UndefOr[ListOfString] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): ApiKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] },
        "customerId" -> customerId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "stageKeys" -> stageKeys.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApiKey]
    }
  }

  /**
   * <p>The identifier of an <a>ApiKey</a> used in a <a>UsagePlan</a>.</p>
   */
  @js.native
  trait ApiKeyIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  object ApiKeyIds {
    def apply(
      ids: js.UndefOr[ListOfString] = js.undefined,
      warnings: js.UndefOr[ListOfString] = js.undefined): ApiKeyIds = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ids" -> ids.map { x => x.asInstanceOf[js.Any] },
        "warnings" -> warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApiKeyIds]
    }
  }

  object ApiKeySourceTypeEnum {
    val HEADER = "HEADER"
    val AUTHORIZER = "AUTHORIZER"

    val values = IndexedSeq(HEADER, AUTHORIZER)
  }

  /**
   * <p>Represents a collection of API keys as represented by an <a>ApiKeys</a> resource.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html">Use API Keys</a> </div>
   */
  @js.native
  trait ApiKeys extends js.Object {
    var warnings: js.UndefOr[ListOfString]
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfApiKey]
  }

  object ApiKeys {
    def apply(
      warnings: js.UndefOr[ListOfString] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfApiKey] = js.undefined): ApiKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        "warnings" -> warnings.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApiKeys]
    }
  }

  object ApiKeysFormatEnum {
    val csv = "csv"

    val values = IndexedSeq(csv)
  }

  /**
   * <p>API stage name of the associated API stage in a usage plan.</p>
   */
  @js.native
  trait ApiStage extends js.Object {
    var apiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
    var throttle: js.UndefOr[MapOfApiStageThrottleSettings]
  }

  object ApiStage {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      stage: js.UndefOr[String] = js.undefined,
      throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.undefined): ApiStage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] },
        "throttle" -> throttle.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApiStage]
    }
  }

  /**
   * <p>Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when a client calls the method.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom authorization</a> </div>
   */
  @js.native
  trait Authorizer extends js.Object {
    var name: js.UndefOr[String]
    var authorizerCredentials: js.UndefOr[String]
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger]
    var identitySource: js.UndefOr[String]
    var authType: js.UndefOr[String]
    var id: js.UndefOr[String]
    var identityValidationExpression: js.UndefOr[String]
    var authorizerUri: js.UndefOr[String]
    var providerARNs: js.UndefOr[ListOfARNs]
    var `type`: js.UndefOr[AuthorizerType]
  }

  object Authorizer {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      authorizerCredentials: js.UndefOr[String] = js.undefined,
      authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined,
      identitySource: js.UndefOr[String] = js.undefined,
      authType: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      identityValidationExpression: js.UndefOr[String] = js.undefined,
      authorizerUri: js.UndefOr[String] = js.undefined,
      providerARNs: js.UndefOr[ListOfARNs] = js.undefined,
      `type`: js.UndefOr[AuthorizerType] = js.undefined): Authorizer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "authorizerCredentials" -> authorizerCredentials.map { x => x.asInstanceOf[js.Any] },
        "authorizerResultTtlInSeconds" -> authorizerResultTtlInSeconds.map { x => x.asInstanceOf[js.Any] },
        "identitySource" -> identitySource.map { x => x.asInstanceOf[js.Any] },
        "authType" -> authType.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "identityValidationExpression" -> identityValidationExpression.map { x => x.asInstanceOf[js.Any] },
        "authorizerUri" -> authorizerUri.map { x => x.asInstanceOf[js.Any] },
        "providerARNs" -> providerARNs.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Authorizer]
    }
  }

  /**
   * <p>The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.</p>
   */
  object AuthorizerTypeEnum {
    val TOKEN = "TOKEN"
    val REQUEST = "REQUEST"
    val COGNITO_USER_POOLS = "COGNITO_USER_POOLS"

    val values = IndexedSeq(TOKEN, REQUEST, COGNITO_USER_POOLS)
  }

  /**
   * <p>Represents a collection of <a>Authorizer</a> resources.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/use-custom-authorizer.html">Enable custom authorization</a> </div>
   */
  @js.native
  trait Authorizers extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfAuthorizer]
  }

  object Authorizers {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfAuthorizer] = js.undefined): Authorizers = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Authorizers]
    }
  }

  /**
   * <p>Represents the base path that callers of the API must provide as part of the URL after the domain name.</p> <div class="remarks">A custom domain name plus a <code>BasePathMapping</code> specification identifies a deployed <a>RestApi</a> in a given stage of the owner <a>Account</a>.</div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Custom Domain Names</a> </div>
   */
  @js.native
  trait BasePathMapping extends js.Object {
    var basePath: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  object BasePathMapping {
    def apply(
      basePath: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      stage: js.UndefOr[String] = js.undefined): BasePathMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "basePath" -> basePath.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BasePathMapping]
    }
  }

  /**
   * <p>Represents a collection of <a>BasePathMapping</a> resources.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Custom Domain Names</a> </div>
   */
  @js.native
  trait BasePathMappings extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfBasePathMapping]
  }

  object BasePathMappings {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfBasePathMapping] = js.undefined): BasePathMappings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BasePathMappings]
    }
  }

  /**
   * <p>Returns the size of the <b>CacheCluster</b>.</p>
   */
  object CacheClusterSizeEnum {
    val `0.5` = "0.5"
    val `1.6` = "1.6"
    val `6.1` = "6.1"
    val `13.5` = "13.5"
    val `28.4` = "28.4"
    val `58.2` = "58.2"
    val `118` = "118"
    val `237` = "237"

    val values = IndexedSeq(`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`)
  }

  /**
   * <p>Returns the status of the <b>CacheCluster</b>.</p>
   */
  object CacheClusterStatusEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val AVAILABLE = "AVAILABLE"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val NOT_AVAILABLE = "NOT_AVAILABLE"
    val FLUSH_IN_PROGRESS = "FLUSH_IN_PROGRESS"

    val values = IndexedSeq(CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS)
  }

  /**
   * <p>Configuration settings of a canary deployment.</p>
   */
  @js.native
  trait CanarySettings extends js.Object {
    var percentTraffic: js.UndefOr[Double]
    var deploymentId: js.UndefOr[String]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  object CanarySettings {
    def apply(
      percentTraffic: js.UndefOr[Double] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined,
      stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined,
      useStageCache: js.UndefOr[Boolean] = js.undefined): CanarySettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "percentTraffic" -> percentTraffic.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "stageVariableOverrides" -> stageVariableOverrides.map { x => x.asInstanceOf[js.Any] },
        "useStageCache" -> useStageCache.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CanarySettings]
    }
  }

  /**
   * <p>Represents a client certificate used to configure client-side SSL authentication while sending requests to the integration endpoint.</p> <div class="remarks">Client certificates are used to authenticate an API by the backend server. To authenticate an API client (or user), use IAM roles and policies, a custom <a>Authorizer</a> or an Amazon Cognito user pool.</div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html">Use Client-Side Certificate</a> </div>
   */
  @js.native
  trait ClientCertificate extends js.Object {
    var expirationDate: js.UndefOr[Timestamp]
    var pemEncodedCertificate: js.UndefOr[String]
    var clientCertificateId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
  }

  object ClientCertificate {
    def apply(
      expirationDate: js.UndefOr[Timestamp] = js.undefined,
      pemEncodedCertificate: js.UndefOr[String] = js.undefined,
      clientCertificateId: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): ClientCertificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "expirationDate" -> expirationDate.map { x => x.asInstanceOf[js.Any] },
        "pemEncodedCertificate" -> pemEncodedCertificate.map { x => x.asInstanceOf[js.Any] },
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientCertificate]
    }
  }

  /**
   * <p>Represents a collection of <a>ClientCertificate</a> resources.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html">Use Client-Side Certificate</a> </div>
   */
  @js.native
  trait ClientCertificates extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfClientCertificate]
  }

  object ClientCertificates {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfClientCertificate] = js.undefined): ClientCertificates = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientCertificates]
    }
  }

  object ConnectionTypeEnum {
    val INTERNET = "INTERNET"
    val VPC_LINK = "VPC_LINK"

    val values = IndexedSeq(INTERNET, VPC_LINK)
  }

  object ContentHandlingStrategyEnum {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY"
    val CONVERT_TO_TEXT = "CONVERT_TO_TEXT"

    val values = IndexedSeq(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
  }

  /**
   * <p>Request to create an <a>ApiKey</a> resource.</p>
   */
  @js.native
  trait CreateApiKeyRequest extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var generateDistinctId: js.UndefOr[Boolean]
    var enabled: js.UndefOr[Boolean]
    var customerId: js.UndefOr[String]
    var stageKeys: js.UndefOr[ListOfStageKeys]
    var value: js.UndefOr[String]
  }

  object CreateApiKeyRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      generateDistinctId: js.UndefOr[Boolean] = js.undefined,
      enabled: js.UndefOr[Boolean] = js.undefined,
      customerId: js.UndefOr[String] = js.undefined,
      stageKeys: js.UndefOr[ListOfStageKeys] = js.undefined,
      value: js.UndefOr[String] = js.undefined): CreateApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "generateDistinctId" -> generateDistinctId.map { x => x.asInstanceOf[js.Any] },
        "enabled" -> enabled.map { x => x.asInstanceOf[js.Any] },
        "customerId" -> customerId.map { x => x.asInstanceOf[js.Any] },
        "stageKeys" -> stageKeys.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApiKeyRequest]
    }
  }

  /**
   * <p>Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.</p>
   */
  @js.native
  trait CreateAuthorizerRequest extends js.Object {
    var name: js.UndefOr[String]
    var authorizerCredentials: js.UndefOr[String]
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger]
    var identitySource: js.UndefOr[String]
    var authType: js.UndefOr[String]
    var identityValidationExpression: js.UndefOr[String]
    var authorizerUri: js.UndefOr[String]
    var providerARNs: js.UndefOr[ListOfARNs]
    var `type`: js.UndefOr[AuthorizerType]
    var restApiId: js.UndefOr[String]
  }

  object CreateAuthorizerRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      authorizerCredentials: js.UndefOr[String] = js.undefined,
      authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined,
      identitySource: js.UndefOr[String] = js.undefined,
      authType: js.UndefOr[String] = js.undefined,
      identityValidationExpression: js.UndefOr[String] = js.undefined,
      authorizerUri: js.UndefOr[String] = js.undefined,
      providerARNs: js.UndefOr[ListOfARNs] = js.undefined,
      `type`: js.UndefOr[AuthorizerType] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): CreateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "authorizerCredentials" -> authorizerCredentials.map { x => x.asInstanceOf[js.Any] },
        "authorizerResultTtlInSeconds" -> authorizerResultTtlInSeconds.map { x => x.asInstanceOf[js.Any] },
        "identitySource" -> identitySource.map { x => x.asInstanceOf[js.Any] },
        "authType" -> authType.map { x => x.asInstanceOf[js.Any] },
        "identityValidationExpression" -> identityValidationExpression.map { x => x.asInstanceOf[js.Any] },
        "authorizerUri" -> authorizerUri.map { x => x.asInstanceOf[js.Any] },
        "providerARNs" -> providerARNs.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAuthorizerRequest]
    }
  }

  /**
   * <p>Requests API Gateway to create a new <a>BasePathMapping</a> resource.</p>
   */
  @js.native
  trait CreateBasePathMappingRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var basePath: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  object CreateBasePathMappingRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      basePath: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      stage: js.UndefOr[String] = js.undefined): CreateBasePathMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "basePath" -> basePath.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBasePathMappingRequest]
    }
  }

  /**
   * <p>Requests API Gateway to create a <a>Deployment</a> resource.</p>
   */
  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var description: js.UndefOr[String]
    var stageDescription: js.UndefOr[String]
    var tracingEnabled: js.UndefOr[NullableBoolean]
    var variables: js.UndefOr[MapOfStringToString]
    var canarySettings: js.UndefOr[DeploymentCanarySettings]
    var cacheClusterEnabled: js.UndefOr[NullableBoolean]
    var stageName: js.UndefOr[String]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var restApiId: js.UndefOr[String]
  }

  object CreateDeploymentRequest {
    def apply(
      description: js.UndefOr[String] = js.undefined,
      stageDescription: js.UndefOr[String] = js.undefined,
      tracingEnabled: js.UndefOr[NullableBoolean] = js.undefined,
      variables: js.UndefOr[MapOfStringToString] = js.undefined,
      canarySettings: js.UndefOr[DeploymentCanarySettings] = js.undefined,
      cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): CreateDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "stageDescription" -> stageDescription.map { x => x.asInstanceOf[js.Any] },
        "tracingEnabled" -> tracingEnabled.map { x => x.asInstanceOf[js.Any] },
        "variables" -> variables.map { x => x.asInstanceOf[js.Any] },
        "canarySettings" -> canarySettings.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterEnabled" -> cacheClusterEnabled.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterSize" -> cacheClusterSize.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
   * <p>Creates a new documentation part of a given API.</p>
   */
  @js.native
  trait CreateDocumentationPartRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var location: js.UndefOr[DocumentationPartLocation]
    var properties: js.UndefOr[String]
  }

  object CreateDocumentationPartRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      location: js.UndefOr[DocumentationPartLocation] = js.undefined,
      properties: js.UndefOr[String] = js.undefined): CreateDocumentationPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "properties" -> properties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentationPartRequest]
    }
  }

  /**
   * <p>Creates a new documentation version of a given API.</p>
   */
  @js.native
  trait CreateDocumentationVersionRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var stageName: js.UndefOr[String]
    var description: js.UndefOr[String]
  }

  object CreateDocumentationVersionRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined): CreateDocumentationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDocumentationVersionRequest]
    }
  }

  /**
   * <p>A request to create a new domain name.</p>
   */
  @js.native
  trait CreateDomainNameRequest extends js.Object {
    var regionalCertificateArn: js.UndefOr[String]
    var certificateName: js.UndefOr[String]
    var certificateBody: js.UndefOr[String]
    var domainName: js.UndefOr[String]
    var certificateArn: js.UndefOr[String]
    var certificatePrivateKey: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var regionalCertificateName: js.UndefOr[String]
    var certificateChain: js.UndefOr[String]
  }

  object CreateDomainNameRequest {
    def apply(
      regionalCertificateArn: js.UndefOr[String] = js.undefined,
      certificateName: js.UndefOr[String] = js.undefined,
      certificateBody: js.UndefOr[String] = js.undefined,
      domainName: js.UndefOr[String] = js.undefined,
      certificateArn: js.UndefOr[String] = js.undefined,
      certificatePrivateKey: js.UndefOr[String] = js.undefined,
      endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
      regionalCertificateName: js.UndefOr[String] = js.undefined,
      certificateChain: js.UndefOr[String] = js.undefined): CreateDomainNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "regionalCertificateArn" -> regionalCertificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "certificateBody" -> certificateBody.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificatePrivateKey" -> certificatePrivateKey.map { x => x.asInstanceOf[js.Any] },
        "endpointConfiguration" -> endpointConfiguration.map { x => x.asInstanceOf[js.Any] },
        "regionalCertificateName" -> regionalCertificateName.map { x => x.asInstanceOf[js.Any] },
        "certificateChain" -> certificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainNameRequest]
    }
  }

  /**
   * <p>Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.</p>
   */
  @js.native
  trait CreateModelRequest extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var schema: js.UndefOr[String]
    var contentType: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
  }

  object CreateModelRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      schema: js.UndefOr[String] = js.undefined,
      contentType: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): CreateModelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "schema" -> schema.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateModelRequest]
    }
  }

  /**
   * <p>Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.</p>
   */
  @js.native
  trait CreateRequestValidatorRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  object CreateRequestValidatorRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      validateRequestBody: js.UndefOr[Boolean] = js.undefined,
      validateRequestParameters: js.UndefOr[Boolean] = js.undefined): CreateRequestValidatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "validateRequestBody" -> validateRequestBody.map { x => x.asInstanceOf[js.Any] },
        "validateRequestParameters" -> validateRequestParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRequestValidatorRequest]
    }
  }

  /**
   * <p>Requests API Gateway to create a <a>Resource</a> resource.</p>
   */
  @js.native
  trait CreateResourceRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var parentId: js.UndefOr[String]
    var pathPart: js.UndefOr[String]
  }

  object CreateResourceRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      parentId: js.UndefOr[String] = js.undefined,
      pathPart: js.UndefOr[String] = js.undefined): CreateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "parentId" -> parentId.map { x => x.asInstanceOf[js.Any] },
        "pathPart" -> pathPart.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceRequest]
    }
  }

  /**
   * <p>The POST Request to add a new <a>RestApi</a> resource to your collection.</p>
   */
  @js.native
  trait CreateRestApiRequest extends js.Object {
    var name: js.UndefOr[String]
    var apiKeySource: js.UndefOr[ApiKeySourceType]
    var description: js.UndefOr[String]
    var binaryMediaTypes: js.UndefOr[ListOfString]
    var cloneFrom: js.UndefOr[String]
    var version: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var policy: js.UndefOr[String]
    var minimumCompressionSize: js.UndefOr[NullableInteger]
  }

  object CreateRestApiRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined,
      cloneFrom: js.UndefOr[String] = js.undefined,
      version: js.UndefOr[String] = js.undefined,
      endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
      policy: js.UndefOr[String] = js.undefined,
      minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined): CreateRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "apiKeySource" -> apiKeySource.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "binaryMediaTypes" -> binaryMediaTypes.map { x => x.asInstanceOf[js.Any] },
        "cloneFrom" -> cloneFrom.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "endpointConfiguration" -> endpointConfiguration.map { x => x.asInstanceOf[js.Any] },
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] },
        "minimumCompressionSize" -> minimumCompressionSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRestApiRequest]
    }
  }

  /**
   * <p>Requests API Gateway to create a <a>Stage</a> resource.</p>
   */
  @js.native
  trait CreateStageRequest extends js.Object {
    var description: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var tracingEnabled: js.UndefOr[Boolean]
    var deploymentId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var variables: js.UndefOr[MapOfStringToString]
    var canarySettings: js.UndefOr[CanarySettings]
    var cacheClusterEnabled: js.UndefOr[Boolean]
    var stageName: js.UndefOr[String]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var restApiId: js.UndefOr[String]
  }

  object CreateStageRequest {
    def apply(
      description: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[MapOfStringToString] = js.undefined,
      tracingEnabled: js.UndefOr[Boolean] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined,
      variables: js.UndefOr[MapOfStringToString] = js.undefined,
      canarySettings: js.UndefOr[CanarySettings] = js.undefined,
      cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): CreateStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "tracingEnabled" -> tracingEnabled.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] },
        "variables" -> variables.map { x => x.asInstanceOf[js.Any] },
        "canarySettings" -> canarySettings.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterEnabled" -> cacheClusterEnabled.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterSize" -> cacheClusterSize.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStageRequest]
    }
  }

  /**
   * <p>The POST request to create a usage plan key for adding an existing API key to a usage plan.</p>
   */
  @js.native
  trait CreateUsagePlanKeyRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var keyId: js.UndefOr[String]
    var keyType: js.UndefOr[String]
  }

  object CreateUsagePlanKeyRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined,
      keyType: js.UndefOr[String] = js.undefined): CreateUsagePlanKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] },
        "keyType" -> keyType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUsagePlanKeyRequest]
    }
  }

  /**
   * <p>The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload.</p>
   */
  @js.native
  trait CreateUsagePlanRequest extends js.Object {
    var name: js.UndefOr[String]
    var quota: js.UndefOr[QuotaSettings]
    var description: js.UndefOr[String]
    var apiStages: js.UndefOr[ListOfApiStage]
    var throttle: js.UndefOr[ThrottleSettings]
  }

  object CreateUsagePlanRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      quota: js.UndefOr[QuotaSettings] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      apiStages: js.UndefOr[ListOfApiStage] = js.undefined,
      throttle: js.UndefOr[ThrottleSettings] = js.undefined): CreateUsagePlanRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "quota" -> quota.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "apiStages" -> apiStages.map { x => x.asInstanceOf[js.Any] },
        "throttle" -> throttle.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUsagePlanRequest]
    }
  }

  /**
   * <p>Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.</p>
   */
  @js.native
  trait CreateVpcLinkRequest extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var targetArns: js.UndefOr[ListOfString]
  }

  object CreateVpcLinkRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      targetArns: js.UndefOr[ListOfString] = js.undefined): CreateVpcLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "targetArns" -> targetArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcLinkRequest]
    }
  }

  /**
   * <p>A request to delete the <a>ApiKey</a> resource.</p>
   */
  @js.native
  trait DeleteApiKeyRequest extends js.Object {
    var apiKey: js.UndefOr[String]
  }

  object DeleteApiKeyRequest {
    def apply(
      apiKey: js.UndefOr[String] = js.undefined): DeleteApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKey" -> apiKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApiKeyRequest]
    }
  }

  /**
   * <p>Request to delete an existing <a>Authorizer</a> resource.</p>
   */
  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var authorizerId: js.UndefOr[String]
  }

  object DeleteAuthorizerRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined): DeleteAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  /**
   * <p>A request to delete the <a>BasePathMapping</a> resource.</p>
   */
  @js.native
  trait DeleteBasePathMappingRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var basePath: js.UndefOr[String]
  }

  object DeleteBasePathMappingRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      basePath: js.UndefOr[String] = js.undefined): DeleteBasePathMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "basePath" -> basePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBasePathMappingRequest]
    }
  }

  /**
   * <p>A request to delete the <a>ClientCertificate</a> resource.</p>
   */
  @js.native
  trait DeleteClientCertificateRequest extends js.Object {
    var clientCertificateId: js.UndefOr[String]
  }

  object DeleteClientCertificateRequest {
    def apply(
      clientCertificateId: js.UndefOr[String] = js.undefined): DeleteClientCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClientCertificateRequest]
    }
  }

  /**
   * <p>Requests API Gateway to delete a <a>Deployment</a> resource.</p>
   */
  @js.native
  trait DeleteDeploymentRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var deploymentId: js.UndefOr[String]
  }

  object DeleteDeploymentRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined): DeleteDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeploymentRequest]
    }
  }

  /**
   * <p>Deletes an existing documentation part of an API.</p>
   */
  @js.native
  trait DeleteDocumentationPartRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationPartId: js.UndefOr[String]
  }

  object DeleteDocumentationPartRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationPartId: js.UndefOr[String] = js.undefined): DeleteDocumentationPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationPartId" -> documentationPartId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentationPartRequest]
    }
  }

  /**
   * <p>Deletes an existing documentation version of an API.</p>
   */
  @js.native
  trait DeleteDocumentationVersionRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
  }

  object DeleteDocumentationVersionRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined): DeleteDocumentationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDocumentationVersionRequest]
    }
  }

  /**
   * <p>A request to delete the <a>DomainName</a> resource.</p>
   */
  @js.native
  trait DeleteDomainNameRequest extends js.Object {
    var domainName: js.UndefOr[String]
  }

  object DeleteDomainNameRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined): DeleteDomainNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainNameRequest]
    }
  }

  /**
   * <p>Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and resets it with the default settings.</p>
   */
  @js.native
  trait DeleteGatewayResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var responseType: js.UndefOr[GatewayResponseType]
  }

  object DeleteGatewayResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      responseType: js.UndefOr[GatewayResponseType] = js.undefined): DeleteGatewayResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "responseType" -> responseType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayResponseRequest]
    }
  }

  /**
   * <p>Represents a delete integration request.</p>
   */
  @js.native
  trait DeleteIntegrationRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
  }

  object DeleteIntegrationRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined): DeleteIntegrationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIntegrationRequest]
    }
  }

  /**
   * <p>Represents a delete integration response request.</p>
   */
  @js.native
  trait DeleteIntegrationResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  object DeleteIntegrationResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      statusCode: js.UndefOr[StatusCode] = js.undefined): DeleteIntegrationResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIntegrationResponseRequest]
    }
  }

  /**
   * <p>Request to delete an existing <a>Method</a> resource.</p>
   */
  @js.native
  trait DeleteMethodRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
  }

  object DeleteMethodRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined): DeleteMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMethodRequest]
    }
  }

  /**
   * <p>A request to delete an existing <a>MethodResponse</a> resource.</p>
   */
  @js.native
  trait DeleteMethodResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  object DeleteMethodResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      statusCode: js.UndefOr[StatusCode] = js.undefined): DeleteMethodResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMethodResponseRequest]
    }
  }

  /**
   * <p>Request to delete an existing model in an existing <a>RestApi</a> resource.</p>
   */
  @js.native
  trait DeleteModelRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var modelName: js.UndefOr[String]
  }

  object DeleteModelRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      modelName: js.UndefOr[String] = js.undefined): DeleteModelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "modelName" -> modelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteModelRequest]
    }
  }

  /**
   * <p>Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.</p>
   */
  @js.native
  trait DeleteRequestValidatorRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var requestValidatorId: js.UndefOr[String]
  }

  object DeleteRequestValidatorRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      requestValidatorId: js.UndefOr[String] = js.undefined): DeleteRequestValidatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "requestValidatorId" -> requestValidatorId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRequestValidatorRequest]
    }
  }

  /**
   * <p>Request to delete a <a>Resource</a>.</p>
   */
  @js.native
  trait DeleteResourceRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
  }

  object DeleteResourceRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined): DeleteResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceRequest]
    }
  }

  /**
   * <p>Request to delete the specified API from your collection.</p>
   */
  @js.native
  trait DeleteRestApiRequest extends js.Object {
    var restApiId: js.UndefOr[String]
  }

  object DeleteRestApiRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined): DeleteRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRestApiRequest]
    }
  }

  /**
   * <p>Requests API Gateway to delete a <a>Stage</a> resource.</p>
   */
  @js.native
  trait DeleteStageRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object DeleteStageRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined): DeleteStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteStageRequest]
    }
  }

  /**
   * <p>The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan.</p>
   */
  @js.native
  trait DeleteUsagePlanKeyRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var keyId: js.UndefOr[String]
  }

  object DeleteUsagePlanKeyRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined): DeleteUsagePlanKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUsagePlanKeyRequest]
    }
  }

  /**
   * <p>The DELETE request to delete a usage plan of a given plan Id.</p>
   */
  @js.native
  trait DeleteUsagePlanRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
  }

  object DeleteUsagePlanRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined): DeleteUsagePlanRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUsagePlanRequest]
    }
  }

  /**
   * <p>Deletes an existing <a>VpcLink</a> of a specified identifier.</p>
   */
  @js.native
  trait DeleteVpcLinkRequest extends js.Object {
    var vpcLinkId: js.UndefOr[String]
  }

  object DeleteVpcLinkRequest {
    def apply(
      vpcLinkId: js.UndefOr[String] = js.undefined): DeleteVpcLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpcLinkId" -> vpcLinkId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcLinkRequest]
    }
  }

  /**
   * <p>An immutable representation of a <a>RestApi</a> resource that can be called by users using <a>Stages</a>. A deployment must be associated with a <a>Stage</a> for it to be callable over the Internet.</p> <div class="remarks">To create a deployment, call <code>POST</code> on the <a>Deployments</a> resource of a <a>RestApi</a>. To view, update, or delete a deployment, call <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> on the specified deployment resource (<code>/restapis/{restapi_id}/deployments/{deployment_id}</code>).</div> <div class="seeAlso"><a>RestApi</a>, <a>Deployments</a>, <a>Stage</a>, <a href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html">AWS CLI</a>, <a href="https://aws.amazon.com/tools/">AWS SDKs</a> </div>
   */
  @js.native
  trait Deployment extends js.Object {
    var id: js.UndefOr[String]
    var description: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot]
  }

  object Deployment {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined,
      apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "apiSummary" -> apiSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
   * <p>The input configuration for a canary deployment.</p>
   */
  @js.native
  trait DeploymentCanarySettings extends js.Object {
    var percentTraffic: js.UndefOr[Double]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  object DeploymentCanarySettings {
    def apply(
      percentTraffic: js.UndefOr[Double] = js.undefined,
      stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined,
      useStageCache: js.UndefOr[Boolean] = js.undefined): DeploymentCanarySettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "percentTraffic" -> percentTraffic.map { x => x.asInstanceOf[js.Any] },
        "stageVariableOverrides" -> stageVariableOverrides.map { x => x.asInstanceOf[js.Any] },
        "useStageCache" -> useStageCache.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeploymentCanarySettings]
    }
  }

  /**
   * <p>Represents a collection resource that contains zero or more references to your existing deployments, and links that guide you on how to interact with your collection. The collection offers a paginated view of the contained deployments.</p> <div class="remarks">To create a new deployment of a <a>RestApi</a>, make a <code>POST</code> request against this resource. To view, update, or delete an existing deployment, make a <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> request, respectively, on a specified <a>Deployment</a> resource.</div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html">Deploying an API</a>, <a href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html">AWS CLI</a>, <a href="https://aws.amazon.com/tools/">AWS SDKs</a> </div>
   */
  @js.native
  trait Deployments extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfDeployment]
  }

  object Deployments {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfDeployment] = js.undefined): Deployments = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployments]
    }
  }

  /**
   * <p>A documentation part for a targeted API entity.</p> <div class="remarks"> <p>A documentation part consists of a content map (<code>properties</code>) and a target (<code>location</code>). The target specifies an API entity to which the documentation content applies. The supported API entity types are <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Valid <code>location</code> fields depend on the API entity type. All valid fields are not required.</p> <p>The content map is a JSON string of API-specific key-value pairs. Although an API can use any shape for the content map, only the OpenAPI-compliant documentation fields will be injected into the associated API entity definition in the exported OpenAPI definition file.</p></div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an API</a>, <a>DocumentationParts</a> </div>
   */
  @js.native
  trait DocumentationPart extends js.Object {
    var id: js.UndefOr[String]
    var location: js.UndefOr[DocumentationPartLocation]
    var properties: js.UndefOr[String]
  }

  object DocumentationPart {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      location: js.UndefOr[DocumentationPartLocation] = js.undefined,
      properties: js.UndefOr[String] = js.undefined): DocumentationPart = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "properties" -> properties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationPart]
    }
  }

  /**
   * <p>A collection of the imported <a>DocumentationPart</a> identifiers.</p> <div class="remarks">This is used to return the result when documentation parts in an external (e.g., OpenAPI) file are imported into API Gateway</div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an API</a>, <a href="https://docs.aws.amazon.com/apigateway/api-reference/link-relation/documentationpart-import/">documentationpart:import</a>, <a>DocumentationPart</a> </div>
   */
  @js.native
  trait DocumentationPartIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  object DocumentationPartIds {
    def apply(
      ids: js.UndefOr[ListOfString] = js.undefined,
      warnings: js.UndefOr[ListOfString] = js.undefined): DocumentationPartIds = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ids" -> ids.map { x => x.asInstanceOf[js.Any] },
        "warnings" -> warnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationPartIds]
    }
  }

  /**
   * <p>Specifies the target API entity to which the documentation applies.</p>
   */
  @js.native
  trait DocumentationPartLocation extends js.Object {
    var statusCode: js.UndefOr[DocumentationPartLocationStatusCode]
    var method: js.UndefOr[String]
    var name: js.UndefOr[String]
    var path: js.UndefOr[String]
    var `type`: js.UndefOr[DocumentationPartType]
  }

  object DocumentationPartLocation {
    def apply(
      statusCode: js.UndefOr[DocumentationPartLocationStatusCode] = js.undefined,
      method: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[DocumentationPartType] = js.undefined): DocumentationPartLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "method" -> method.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationPartLocation]
    }
  }

  object DocumentationPartTypeEnum {
    val API = "API"
    val AUTHORIZER = "AUTHORIZER"
    val MODEL = "MODEL"
    val RESOURCE = "RESOURCE"
    val METHOD = "METHOD"
    val PATH_PARAMETER = "PATH_PARAMETER"
    val QUERY_PARAMETER = "QUERY_PARAMETER"
    val REQUEST_HEADER = "REQUEST_HEADER"
    val REQUEST_BODY = "REQUEST_BODY"
    val RESPONSE = "RESPONSE"
    val RESPONSE_HEADER = "RESPONSE_HEADER"
    val RESPONSE_BODY = "RESPONSE_BODY"

    val values = IndexedSeq(API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, RESPONSE_BODY)
  }

  /**
   * <p>The collection of documentation parts of an API.</p> <div class="remarks"/> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an API</a>, <a>DocumentationPart</a> </div>
   */
  @js.native
  trait DocumentationParts extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfDocumentationPart]
  }

  object DocumentationParts {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfDocumentationPart] = js.undefined): DocumentationParts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationParts]
    }
  }

  /**
   * <p>A snapshot of the documentation of an API.</p> <div class="remarks"><p>Publishing API documentation involves creating a documentation version associated with an API stage and exporting the versioned documentation to an external (e.g., OpenAPI) file.</p></div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an API</a>, <a>DocumentationPart</a>, <a>DocumentationVersions</a> </div>
   */
  @js.native
  trait DocumentationVersion extends js.Object {
    var version: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
  }

  object DocumentationVersion {
    def apply(
      version: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined,
      description: js.UndefOr[String] = js.undefined): DocumentationVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationVersion]
    }
  }

  /**
   * <p>The collection of documentation snapshots of an API. </p> <div class="remarks"><p>Use the <a>DocumentationVersions</a> to manage documentation snapshots associated with various API stages.</p></div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an API</a>, <a>DocumentationPart</a>, <a>DocumentationVersion</a> </div>
   */
  @js.native
  trait DocumentationVersions extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfDocumentationVersion]
  }

  object DocumentationVersions {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfDocumentationVersion] = js.undefined): DocumentationVersions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DocumentationVersions]
    }
  }

  /**
   * <p>Represents a custom domain name as a user-friendly host name of an API (<a>RestApi</a>).</p> <div class="Remarks"> <p>When you deploy an API, API Gateway creates a default host name for the API. This default API host name is of the <code>{restapi-id}.execute-api.{region}.amazonaws.com</code> format. With the default host name, you can access the API's root resource with the URL of <code>https://{restapi-id}.execute-api.{region}.amazonaws.com/{stage}/</code>. When you set up a custom domain name of <code>apis.example.com</code> for this API, you can then access the same resource using the URL of the <code>https://apis.examples.com/myApi</code>, where <code>myApi</code> is the base path mapping (<a>BasePathMapping</a>) of your API under the custom domain name. </p> </div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Set a Custom Host Name for an API</a> </div>
   */
  @js.native
  trait DomainName extends js.Object {
    var regionalCertificateArn: js.UndefOr[String]
    var certificateName: js.UndefOr[String]
    var distributionHostedZoneId: js.UndefOr[String]
    var regionalDomainName: js.UndefOr[String]
    var domainName: js.UndefOr[String]
    var certificateArn: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var regionalCertificateName: js.UndefOr[String]
    var certificateUploadDate: js.UndefOr[Timestamp]
    var regionalHostedZoneId: js.UndefOr[String]
    var distributionDomainName: js.UndefOr[String]
  }

  object DomainName {
    def apply(
      regionalCertificateArn: js.UndefOr[String] = js.undefined,
      certificateName: js.UndefOr[String] = js.undefined,
      distributionHostedZoneId: js.UndefOr[String] = js.undefined,
      regionalDomainName: js.UndefOr[String] = js.undefined,
      domainName: js.UndefOr[String] = js.undefined,
      certificateArn: js.UndefOr[String] = js.undefined,
      endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
      regionalCertificateName: js.UndefOr[String] = js.undefined,
      certificateUploadDate: js.UndefOr[Timestamp] = js.undefined,
      regionalHostedZoneId: js.UndefOr[String] = js.undefined,
      distributionDomainName: js.UndefOr[String] = js.undefined): DomainName = {
      val _fields = IndexedSeq[(String, js.Any)](
        "regionalCertificateArn" -> regionalCertificateArn.map { x => x.asInstanceOf[js.Any] },
        "certificateName" -> certificateName.map { x => x.asInstanceOf[js.Any] },
        "distributionHostedZoneId" -> distributionHostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "regionalDomainName" -> regionalDomainName.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "certificateArn" -> certificateArn.map { x => x.asInstanceOf[js.Any] },
        "endpointConfiguration" -> endpointConfiguration.map { x => x.asInstanceOf[js.Any] },
        "regionalCertificateName" -> regionalCertificateName.map { x => x.asInstanceOf[js.Any] },
        "certificateUploadDate" -> certificateUploadDate.map { x => x.asInstanceOf[js.Any] },
        "regionalHostedZoneId" -> regionalHostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "distributionDomainName" -> distributionDomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainName]
    }
  }

  /**
   * <p>Represents a collection of <a>DomainName</a> resources.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Client-Side Certificate</a> </div>
   */
  @js.native
  trait DomainNames extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfDomainName]
  }

  object DomainNames {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfDomainName] = js.undefined): DomainNames = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainNames]
    }
  }

  /**
   * <p>The endpoint configuration to indicate the types of endpoints an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>) has. </p>
   */
  @js.native
  trait EndpointConfiguration extends js.Object {
    var types: js.UndefOr[ListOfEndpointType]
  }

  object EndpointConfiguration {
    def apply(
      types: js.UndefOr[ListOfEndpointType] = js.undefined): EndpointConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "types" -> types.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointConfiguration]
    }
  }

  /**
   * <p>The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.</p>
   */
  object EndpointTypeEnum {
    val REGIONAL = "REGIONAL"
    val EDGE = "EDGE"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(REGIONAL, EDGE, PRIVATE)
  }

  /**
   * <p>The binary blob response to <a>GetExport</a>, which contains the generated SDK.</p>
   */
  @js.native
  trait ExportResponse extends js.Object {
    var contentType: js.UndefOr[String]
    var contentDisposition: js.UndefOr[String]
    var body: js.UndefOr[Blob]
  }

  object ExportResponse {
    def apply(
      contentType: js.UndefOr[String] = js.undefined,
      contentDisposition: js.UndefOr[String] = js.undefined,
      body: js.UndefOr[Blob] = js.undefined): ExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "contentDisposition" -> contentDisposition.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportResponse]
    }
  }

  /**
   * <p>Request to flush authorizer cache entries on a specified stage.</p>
   */
  @js.native
  trait FlushStageAuthorizersCacheRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object FlushStageAuthorizersCacheRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined): FlushStageAuthorizersCacheRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlushStageAuthorizersCacheRequest]
    }
  }

  /**
   * <p>Requests API Gateway to flush a stage's cache.</p>
   */
  @js.native
  trait FlushStageCacheRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object FlushStageCacheRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined): FlushStageCacheRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlushStageCacheRequest]
    }
  }

  /**
   * <p>A gateway response of a given response type and status code, with optional response parameters and mapping templates.</p> <div class="remarks"> For more information about valid gateway response types, see <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html">Gateway Response Types Supported by API Gateway</a> <div class="example"> <h4>Example: Get a Gateway Response of a given response type</h4> <h5>Request</h5> <p>This example shows how to get a gateway response of the <code>MISSING_AUTHENTICATION_TOKEN</code> type.</p> <pre><code>GET /restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T202516Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=1b52460e3159c1a26cff29093855d50ea141c1c5b937528fecaf60f51129697a Cache-Control: no-cache Postman-Token: 3b2a1ce9-c848-2e26-2e2f-9c2caefbed45 </code></pre> <p>The response type is specified as a URL path.</p> <h5>Response</h5> <p>The successful operation returns the <code>200 OK</code> status code and a payload similar to the following:</p> <pre><code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:delete": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": false, "responseParameters": { "gatewayresponse.header.x-request-path": "method.request.path.petId", "gatewayresponse.header.Access-Control-Allow-Origin": "&apos;a.b.c&apos;", "gatewayresponse.header.x-request-query": "method.request.querystring.q", "gatewayresponse.header.x-request-header": "method.request.header.Accept" }, "responseTemplates": { "application/json": "{\n \"message\": $context.error.messageString,\n \"type\": \"$context.error.responseType\",\n \"stage\": \"$context.stage\",\n \"resourcePath\": \"$context.resourcePath\",\n \"stageVariables.a\": \"$stageVariables.a\",\n \"statusCode\": \"&apos;404&apos;\"\n}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "404" }</code></pre> <p></p> </div> </div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html">Customize Gateway Responses</a> </div>
   */
  @js.native
  trait GatewayResponse extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var defaultResponse: js.UndefOr[Boolean]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseType: js.UndefOr[GatewayResponseType]
    var responseTemplates: js.UndefOr[MapOfStringToString]
  }

  object GatewayResponse {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      defaultResponse: js.UndefOr[Boolean] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      responseType: js.UndefOr[GatewayResponseType] = js.undefined,
      responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined): GatewayResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "defaultResponse" -> defaultResponse.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "responseType" -> responseType.map { x => x.asInstanceOf[js.Any] },
        "responseTemplates" -> responseTemplates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GatewayResponse]
    }
  }

  object GatewayResponseTypeEnum {
    val DEFAULT_4XX = "DEFAULT_4XX"
    val DEFAULT_5XX = "DEFAULT_5XX"
    val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND"
    val UNAUTHORIZED = "UNAUTHORIZED"
    val INVALID_API_KEY = "INVALID_API_KEY"
    val ACCESS_DENIED = "ACCESS_DENIED"
    val AUTHORIZER_FAILURE = "AUTHORIZER_FAILURE"
    val AUTHORIZER_CONFIGURATION_ERROR = "AUTHORIZER_CONFIGURATION_ERROR"
    val INVALID_SIGNATURE = "INVALID_SIGNATURE"
    val EXPIRED_TOKEN = "EXPIRED_TOKEN"
    val MISSING_AUTHENTICATION_TOKEN = "MISSING_AUTHENTICATION_TOKEN"
    val INTEGRATION_FAILURE = "INTEGRATION_FAILURE"
    val INTEGRATION_TIMEOUT = "INTEGRATION_TIMEOUT"
    val API_CONFIGURATION_ERROR = "API_CONFIGURATION_ERROR"
    val UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE"
    val BAD_REQUEST_PARAMETERS = "BAD_REQUEST_PARAMETERS"
    val BAD_REQUEST_BODY = "BAD_REQUEST_BODY"
    val REQUEST_TOO_LARGE = "REQUEST_TOO_LARGE"
    val THROTTLED = "THROTTLED"
    val QUOTA_EXCEEDED = "QUOTA_EXCEEDED"

    val values = IndexedSeq(DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND, UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE, AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN, MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT, API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS, BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED)
  }

  /**
   * <p>The collection of the <a>GatewayResponse</a> instances of a <a>RestApi</a> as a <code>responseType</code>-to-<a>GatewayResponse</a> object map of key-value pairs. As such, pagination is not supported for querying this collection.</p> <div class="remarks"> For more information about valid gateway response types, see <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html">Gateway Response Types Supported by API Gateway</a> <div class="example"> <h4>Example: Get the collection of gateway responses of an API</h4> <h5>Request</h5> <p>This example request shows how to retrieve the <a>GatewayResponses</a> collection from an API.</p> <pre><code>GET /restapis/o81lxisefl/gatewayresponses HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T220604Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=59b42fe54a76a5de8adf2c67baa6d39206f8e9ad49a1d77ccc6a5da3103a398a Cache-Control: no-cache Postman-Token: 5637af27-dc29-fc5c-9dfe-0645d52cb515 </code></pre> <p></p> <h5>Response</h5> <p>The successful operation returns the <code>200 OK</code> status code and a payload similar to the following:</p> <pre><code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses" }, "first": { "href": "/restapis/o81lxisefl/gatewayresponses" }, "gatewayresponse:by-type": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "item": [ { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" }, { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" }, { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" }, { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" }, { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" }, { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" }, { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" }, { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" }, { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" }, { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" }, { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" } ] }, "_embedded": { "item": [ { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "INTEGRATION_FAILURE", "statusCode": "504" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "RESOURCE_NOT_FOUND", "statusCode": "404" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "REQUEST_TOO_LARGE", "statusCode": "413" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "THROTTLED", "statusCode": "429" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "UNSUPPORTED_MEDIA_TYPE", "statusCode": "415" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "AUTHORIZER_CONFIGURATION_ERROR", "statusCode": "500" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "DEFAULT_5XX" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "DEFAULT_4XX" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "BAD_REQUEST_PARAMETERS", "statusCode": "400" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "BAD_REQUEST_BODY", "statusCode": "400" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "EXPIRED_TOKEN", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "ACCESS_DENIED", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "INVALID_API_KEY", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "UNAUTHORIZED", "statusCode": "401" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "API_CONFIGURATION_ERROR", "statusCode": "500" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "QUOTA_EXCEEDED", "statusCode": "429" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "INTEGRATION_TIMEOUT", "statusCode": "504" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "INVALID_SIGNATURE", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{\"message\":$context.error.messageString}" }, "responseType": "AUTHORIZER_FAILURE", "statusCode": "500" } ] } }</code></pre> <p></p> </div> </div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html">Customize Gateway Responses</a> </div>
   */
  @js.native
  trait GatewayResponses extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfGatewayResponse]
  }

  object GatewayResponses {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfGatewayResponse] = js.undefined): GatewayResponses = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GatewayResponses]
    }
  }

  /**
   * <p>A request to generate a <a>ClientCertificate</a> resource.</p>
   */
  @js.native
  trait GenerateClientCertificateRequest extends js.Object {
    var description: js.UndefOr[String]
  }

  object GenerateClientCertificateRequest {
    def apply(
      description: js.UndefOr[String] = js.undefined): GenerateClientCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateClientCertificateRequest]
    }
  }

  /**
   * <p>Requests API Gateway to get information about the current <a>Account</a> resource.</p>
   */
  @js.native
  trait GetAccountRequest extends js.Object {

  }

  object GetAccountRequest {
    def apply(): GetAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountRequest]
    }
  }

  /**
   * <p>A request to get information about the current <a>ApiKey</a> resource.</p>
   */
  @js.native
  trait GetApiKeyRequest extends js.Object {
    var apiKey: js.UndefOr[String]
    var includeValue: js.UndefOr[NullableBoolean]
  }

  object GetApiKeyRequest {
    def apply(
      apiKey: js.UndefOr[String] = js.undefined,
      includeValue: js.UndefOr[NullableBoolean] = js.undefined): GetApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKey" -> apiKey.map { x => x.asInstanceOf[js.Any] },
        "includeValue" -> includeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApiKeyRequest]
    }
  }

  /**
   * <p>A request to get information about the current <a>ApiKeys</a> resource.</p>
   */
  @js.native
  trait GetApiKeysRequest extends js.Object {
    var customerId: js.UndefOr[String]
    var includeValues: js.UndefOr[NullableBoolean]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
  }

  object GetApiKeysRequest {
    def apply(
      customerId: js.UndefOr[String] = js.undefined,
      includeValues: js.UndefOr[NullableBoolean] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined,
      nameQuery: js.UndefOr[String] = js.undefined): GetApiKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "customerId" -> customerId.map { x => x.asInstanceOf[js.Any] },
        "includeValues" -> includeValues.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nameQuery" -> nameQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetApiKeysRequest]
    }
  }

  /**
   * <p>Request to describe an existing <a>Authorizer</a> resource.</p>
   */
  @js.native
  trait GetAuthorizerRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var authorizerId: js.UndefOr[String]
  }

  object GetAuthorizerRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined): GetAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAuthorizerRequest]
    }
  }

  /**
   * <p>Request to describe an existing <a>Authorizers</a> resource.</p>
   */
  @js.native
  trait GetAuthorizersRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetAuthorizersRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetAuthorizersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAuthorizersRequest]
    }
  }

  /**
   * <p>Request to describe a <a>BasePathMapping</a> resource.</p>
   */
  @js.native
  trait GetBasePathMappingRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var basePath: js.UndefOr[String]
  }

  object GetBasePathMappingRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      basePath: js.UndefOr[String] = js.undefined): GetBasePathMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "basePath" -> basePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBasePathMappingRequest]
    }
  }

  /**
   * <p>A request to get information about a collection of <a>BasePathMapping</a> resources.</p>
   */
  @js.native
  trait GetBasePathMappingsRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetBasePathMappingsRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetBasePathMappingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBasePathMappingsRequest]
    }
  }

  /**
   * <p>A request to get information about the current <a>ClientCertificate</a> resource.</p>
   */
  @js.native
  trait GetClientCertificateRequest extends js.Object {
    var clientCertificateId: js.UndefOr[String]
  }

  object GetClientCertificateRequest {
    def apply(
      clientCertificateId: js.UndefOr[String] = js.undefined): GetClientCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClientCertificateRequest]
    }
  }

  /**
   * <p>A request to get information about a collection of <a>ClientCertificate</a> resources.</p>
   */
  @js.native
  trait GetClientCertificatesRequest extends js.Object {
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetClientCertificatesRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetClientCertificatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetClientCertificatesRequest]
    }
  }

  /**
   * <p>Requests API Gateway to get information about a <a>Deployment</a> resource.</p>
   */
  @js.native
  trait GetDeploymentRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var deploymentId: js.UndefOr[String]
    var embed: js.UndefOr[ListOfString]
  }

  object GetDeploymentRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined,
      embed: js.UndefOr[ListOfString] = js.undefined): GetDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "embed" -> embed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentRequest]
    }
  }

  /**
   * <p>Requests API Gateway to get information about a <a>Deployments</a> collection.</p>
   */
  @js.native
  trait GetDeploymentsRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetDeploymentsRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetDeploymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentsRequest]
    }
  }

  /**
   * <p>Gets a specified documentation part of a given API.</p>
   */
  @js.native
  trait GetDocumentationPartRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationPartId: js.UndefOr[String]
  }

  object GetDocumentationPartRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationPartId: js.UndefOr[String] = js.undefined): GetDocumentationPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationPartId" -> documentationPartId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentationPartRequest]
    }
  }

  /**
   * <p>Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets).</p>
   */
  @js.native
  trait GetDocumentationPartsRequest extends js.Object {
    var locationStatus: js.UndefOr[LocationStatusType]
    var path: js.UndefOr[String]
    var position: js.UndefOr[String]
    var `type`: js.UndefOr[DocumentationPartType]
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
  }

  object GetDocumentationPartsRequest {
    def apply(
      locationStatus: js.UndefOr[LocationStatusType] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[DocumentationPartType] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined,
      nameQuery: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): GetDocumentationPartsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "locationStatus" -> locationStatus.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nameQuery" -> nameQuery.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentationPartsRequest]
    }
  }

  /**
   * <p>Gets a documentation snapshot of an API.</p>
   */
  @js.native
  trait GetDocumentationVersionRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
  }

  object GetDocumentationVersionRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined): GetDocumentationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentationVersionRequest]
    }
  }

  /**
   * <p>Gets the documentation versions of an API.</p>
   */
  @js.native
  trait GetDocumentationVersionsRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetDocumentationVersionsRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetDocumentationVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDocumentationVersionsRequest]
    }
  }

  /**
   * <p>Request to get the name of a <a>DomainName</a> resource.</p>
   */
  @js.native
  trait GetDomainNameRequest extends js.Object {
    var domainName: js.UndefOr[String]
  }

  object GetDomainNameRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined): GetDomainNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainNameRequest]
    }
  }

  /**
   * <p>Request to describe a collection of <a>DomainName</a> resources.</p>
   */
  @js.native
  trait GetDomainNamesRequest extends js.Object {
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetDomainNamesRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetDomainNamesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainNamesRequest]
    }
  }

  /**
   * <p>Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.</p>
   */
  @js.native
  trait GetExportRequest extends js.Object {
    var exportType: js.UndefOr[String]
    var stageName: js.UndefOr[String]
    var accepts: js.UndefOr[String]
    var parameters: js.UndefOr[MapOfStringToString]
    var restApiId: js.UndefOr[String]
  }

  object GetExportRequest {
    def apply(
      exportType: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      accepts: js.UndefOr[String] = js.undefined,
      parameters: js.UndefOr[MapOfStringToString] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): GetExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportType" -> exportType.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "accepts" -> accepts.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportRequest]
    }
  }

  /**
   * <p>Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.</p>
   */
  @js.native
  trait GetGatewayResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var responseType: js.UndefOr[GatewayResponseType]
  }

  object GetGatewayResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      responseType: js.UndefOr[GatewayResponseType] = js.undefined): GetGatewayResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "responseType" -> responseType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGatewayResponseRequest]
    }
  }

  /**
   * <p>Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a> collection for the supported response types.</p>
   */
  @js.native
  trait GetGatewayResponsesRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetGatewayResponsesRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetGatewayResponsesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGatewayResponsesRequest]
    }
  }

  /**
   * <p>Represents a request to get the integration configuration.</p>
   */
  @js.native
  trait GetIntegrationRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
  }

  object GetIntegrationRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined): GetIntegrationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntegrationRequest]
    }
  }

  /**
   * <p>Represents a get integration response request.</p>
   */
  @js.native
  trait GetIntegrationResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  object GetIntegrationResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      statusCode: js.UndefOr[StatusCode] = js.undefined): GetIntegrationResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntegrationResponseRequest]
    }
  }

  /**
   * <p>Request to describe an existing <a>Method</a> resource.</p>
   */
  @js.native
  trait GetMethodRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
  }

  object GetMethodRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined): GetMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMethodRequest]
    }
  }

  /**
   * <p>Request to describe a <a>MethodResponse</a> resource.</p>
   */
  @js.native
  trait GetMethodResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  object GetMethodResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      statusCode: js.UndefOr[StatusCode] = js.undefined): GetMethodResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMethodResponseRequest]
    }
  }

  /**
   * <p>Request to list information about a model in an existing <a>RestApi</a> resource.</p>
   */
  @js.native
  trait GetModelRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var modelName: js.UndefOr[String]
    var flatten: js.UndefOr[Boolean]
  }

  object GetModelRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      modelName: js.UndefOr[String] = js.undefined,
      flatten: js.UndefOr[Boolean] = js.undefined): GetModelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "modelName" -> modelName.map { x => x.asInstanceOf[js.Any] },
        "flatten" -> flatten.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetModelRequest]
    }
  }

  /**
   * <p>Request to generate a sample mapping template used to transform the payload.</p>
   */
  @js.native
  trait GetModelTemplateRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var modelName: js.UndefOr[String]
  }

  object GetModelTemplateRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      modelName: js.UndefOr[String] = js.undefined): GetModelTemplateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "modelName" -> modelName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetModelTemplateRequest]
    }
  }

  /**
   * <p>Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.</p>
   */
  @js.native
  trait GetModelsRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetModelsRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetModelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetModelsRequest]
    }
  }

  /**
   * <p>Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.</p>
   */
  @js.native
  trait GetRequestValidatorRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var requestValidatorId: js.UndefOr[String]
  }

  object GetRequestValidatorRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      requestValidatorId: js.UndefOr[String] = js.undefined): GetRequestValidatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "requestValidatorId" -> requestValidatorId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRequestValidatorRequest]
    }
  }

  /**
   * <p>Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.</p>
   */
  @js.native
  trait GetRequestValidatorsRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetRequestValidatorsRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetRequestValidatorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRequestValidatorsRequest]
    }
  }

  /**
   * <p>Request to list information about a resource.</p>
   */
  @js.native
  trait GetResourceRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var embed: js.UndefOr[ListOfString]
  }

  object GetResourceRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      embed: js.UndefOr[ListOfString] = js.undefined): GetResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "embed" -> embed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceRequest]
    }
  }

  /**
   * <p>Request to list information about a collection of resources.</p>
   */
  @js.native
  trait GetResourcesRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var embed: js.UndefOr[ListOfString]
  }

  object GetResourcesRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined,
      embed: js.UndefOr[ListOfString] = js.undefined): GetResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "embed" -> embed.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcesRequest]
    }
  }

  /**
   * <p>The GET request to list an existing <a>RestApi</a> defined for your collection. </p>
   */
  @js.native
  trait GetRestApiRequest extends js.Object {
    var restApiId: js.UndefOr[String]
  }

  object GetRestApiRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined): GetRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRestApiRequest]
    }
  }

  /**
   * <p>The GET request to list existing <a>RestApis</a> defined for your collection.</p>
   */
  @js.native
  trait GetRestApisRequest extends js.Object {
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetRestApisRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetRestApisRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRestApisRequest]
    }
  }

  /**
   * <p>Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.</p>
   */
  @js.native
  trait GetSdkRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
    var sdkType: js.UndefOr[String]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  object GetSdkRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      sdkType: js.UndefOr[String] = js.undefined,
      parameters: js.UndefOr[MapOfStringToString] = js.undefined): GetSdkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "sdkType" -> sdkType.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSdkRequest]
    }
  }

  /**
   * <p>Get an <a>SdkType</a> instance.</p>
   */
  @js.native
  trait GetSdkTypeRequest extends js.Object {
    var id: js.UndefOr[String]
  }

  object GetSdkTypeRequest {
    def apply(
      id: js.UndefOr[String] = js.undefined): GetSdkTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSdkTypeRequest]
    }
  }

  /**
   * <p>Get the <a>SdkTypes</a> collection.</p>
   */
  @js.native
  trait GetSdkTypesRequest extends js.Object {
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetSdkTypesRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetSdkTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSdkTypesRequest]
    }
  }

  /**
   * <p>Requests API Gateway to get information about a <a>Stage</a> resource.</p>
   */
  @js.native
  trait GetStageRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object GetStageRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined): GetStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStageRequest]
    }
  }

  /**
   * <p>Requests API Gateway to get information about one or more <a>Stage</a> resources.</p>
   */
  @js.native
  trait GetStagesRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var deploymentId: js.UndefOr[String]
  }

  object GetStagesRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined): GetStagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStagesRequest]
    }
  }

  /**
   * <p>Gets the <a>Tags</a> collection for a given resource.</p>
   */
  @js.native
  trait GetTagsRequest extends js.Object {
    var resourceArn: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetTagsRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagsRequest]
    }
  }

  /**
   * <p>The GET request to get a usage plan key of a given key identifier.</p>
   */
  @js.native
  trait GetUsagePlanKeyRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var keyId: js.UndefOr[String]
  }

  object GetUsagePlanKeyRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined): GetUsagePlanKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUsagePlanKeyRequest]
    }
  }

  /**
   * <p>The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.</p>
   */
  @js.native
  trait GetUsagePlanKeysRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
  }

  object GetUsagePlanKeysRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined,
      nameQuery: js.UndefOr[String] = js.undefined): GetUsagePlanKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nameQuery" -> nameQuery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUsagePlanKeysRequest]
    }
  }

  /**
   * <p>The GET request to get a usage plan of a given plan identifier.</p>
   */
  @js.native
  trait GetUsagePlanRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
  }

  object GetUsagePlanRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined): GetUsagePlanRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUsagePlanRequest]
    }
  }

  /**
   * <p>The GET request to get all the usage plans of the caller's account.</p>
   */
  @js.native
  trait GetUsagePlansRequest extends js.Object {
    var position: js.UndefOr[String]
    var keyId: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetUsagePlansRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetUsagePlansRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUsagePlansRequest]
    }
  }

  /**
   * <p>The GET request to get the usage data of a usage plan in a specified time interval.</p>
   */
  @js.native
  trait GetUsageRequest extends js.Object {
    var endDate: js.UndefOr[String]
    var keyId: js.UndefOr[String]
    var usagePlanId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var startDate: js.UndefOr[String]
  }

  object GetUsageRequest {
    def apply(
      endDate: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined,
      usagePlanId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined,
      startDate: js.UndefOr[String] = js.undefined): GetUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endDate" -> endDate.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] },
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "startDate" -> startDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUsageRequest]
    }
  }

  /**
   * <p>Gets a specified VPC link under the caller's account in a region.</p>
   */
  @js.native
  trait GetVpcLinkRequest extends js.Object {
    var vpcLinkId: js.UndefOr[String]
  }

  object GetVpcLinkRequest {
    def apply(
      vpcLinkId: js.UndefOr[String] = js.undefined): GetVpcLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpcLinkId" -> vpcLinkId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVpcLinkRequest]
    }
  }

  /**
   * <p>Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.</p>
   */
  @js.native
  trait GetVpcLinksRequest extends js.Object {
    var position: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
  }

  object GetVpcLinksRequest {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      limit: js.UndefOr[NullableInteger] = js.undefined): GetVpcLinksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVpcLinksRequest]
    }
  }

  /**
   * <p>The POST request to import API keys from an external source, such as a CSV-formatted file.</p>
   */
  @js.native
  trait ImportApiKeysRequest extends js.Object {
    var body: js.UndefOr[Blob]
    var format: js.UndefOr[ApiKeysFormat]
    var failOnWarnings: js.UndefOr[Boolean]
  }

  object ImportApiKeysRequest {
    def apply(
      body: js.UndefOr[Blob] = js.undefined,
      format: js.UndefOr[ApiKeysFormat] = js.undefined,
      failOnWarnings: js.UndefOr[Boolean] = js.undefined): ImportApiKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] },
        "failOnWarnings" -> failOnWarnings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportApiKeysRequest]
    }
  }

  /**
   * <p>Import documentation parts from an external (e.g., OpenAPI) definition file. </p>
   */
  @js.native
  trait ImportDocumentationPartsRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var mode: js.UndefOr[PutMode]
    var failOnWarnings: js.UndefOr[Boolean]
    var body: js.UndefOr[Blob]
  }

  object ImportDocumentationPartsRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      mode: js.UndefOr[PutMode] = js.undefined,
      failOnWarnings: js.UndefOr[Boolean] = js.undefined,
      body: js.UndefOr[Blob] = js.undefined): ImportDocumentationPartsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "mode" -> mode.map { x => x.asInstanceOf[js.Any] },
        "failOnWarnings" -> failOnWarnings.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportDocumentationPartsRequest]
    }
  }

  /**
   * <p>A POST request to import an API to API Gateway using an input of an API definition file.</p>
   */
  @js.native
  trait ImportRestApiRequest extends js.Object {
    var failOnWarnings: js.UndefOr[Boolean]
    var parameters: js.UndefOr[MapOfStringToString]
    var body: js.UndefOr[Blob]
  }

  object ImportRestApiRequest {
    def apply(
      failOnWarnings: js.UndefOr[Boolean] = js.undefined,
      parameters: js.UndefOr[MapOfStringToString] = js.undefined,
      body: js.UndefOr[Blob] = js.undefined): ImportRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failOnWarnings" -> failOnWarnings.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportRestApiRequest]
    }
  }

  /**
   * <p>Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.</p> <div class="remarks">In the API Gateway console, the built-in Lambda integration is an AWS integration.</div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a> </div>
   */
  @js.native
  trait Integration extends js.Object {
    var requestParameters: js.UndefOr[MapOfStringToString]
    var timeoutInMillis: js.UndefOr[Int]
    var integrationResponses: js.UndefOr[MapOfIntegrationResponse]
    var uri: js.UndefOr[String]
    var cacheKeyParameters: js.UndefOr[ListOfString]
    var httpMethod: js.UndefOr[String]
    var requestTemplates: js.UndefOr[MapOfStringToString]
    var cacheNamespace: js.UndefOr[String]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var connectionId: js.UndefOr[String]
    var `type`: js.UndefOr[IntegrationType]
    var passthroughBehavior: js.UndefOr[String]
    var credentials: js.UndefOr[String]
    var connectionType: js.UndefOr[ConnectionType]
  }

  object Integration {
    def apply(
      requestParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      timeoutInMillis: js.UndefOr[Int] = js.undefined,
      integrationResponses: js.UndefOr[MapOfIntegrationResponse] = js.undefined,
      uri: js.UndefOr[String] = js.undefined,
      cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
      cacheNamespace: js.UndefOr[String] = js.undefined,
      contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
      connectionId: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[IntegrationType] = js.undefined,
      passthroughBehavior: js.UndefOr[String] = js.undefined,
      credentials: js.UndefOr[String] = js.undefined,
      connectionType: js.UndefOr[ConnectionType] = js.undefined): Integration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "requestParameters" -> requestParameters.map { x => x.asInstanceOf[js.Any] },
        "timeoutInMillis" -> timeoutInMillis.map { x => x.asInstanceOf[js.Any] },
        "integrationResponses" -> integrationResponses.map { x => x.asInstanceOf[js.Any] },
        "uri" -> uri.map { x => x.asInstanceOf[js.Any] },
        "cacheKeyParameters" -> cacheKeyParameters.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "requestTemplates" -> requestTemplates.map { x => x.asInstanceOf[js.Any] },
        "cacheNamespace" -> cacheNamespace.map { x => x.asInstanceOf[js.Any] },
        "contentHandling" -> contentHandling.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "passthroughBehavior" -> passthroughBehavior.map { x => x.asInstanceOf[js.Any] },
        "credentials" -> credentials.map { x => x.asInstanceOf[js.Any] },
        "connectionType" -> connectionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Integration]
    }
  }

  /**
   * <p>Represents an integration response. The status code must map to an existing <a>MethodResponse</a>, and parameters and templates can be used to transform the back-end response.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a> </div>
   */
  @js.native
  trait IntegrationResponse extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var selectionPattern: js.UndefOr[String]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var responseTemplates: js.UndefOr[MapOfStringToString]
  }

  object IntegrationResponse {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      selectionPattern: js.UndefOr[String] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
      responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined): IntegrationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "selectionPattern" -> selectionPattern.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "contentHandling" -> contentHandling.map { x => x.asInstanceOf[js.Any] },
        "responseTemplates" -> responseTemplates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntegrationResponse]
    }
  }

  /**
   * <p>The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration. </p>
   */
  object IntegrationTypeEnum {
    val HTTP = "HTTP"
    val AWS = "AWS"
    val MOCK = "MOCK"
    val HTTP_PROXY = "HTTP_PROXY"
    val AWS_PROXY = "AWS_PROXY"

    val values = IndexedSeq(HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY)
  }

  object LocationStatusTypeEnum {
    val DOCUMENTED = "DOCUMENTED"
    val UNDOCUMENTED = "UNDOCUMENTED"

    val values = IndexedSeq(DOCUMENTED, UNDOCUMENTED)
  }

  /**
   * <p> Represents a client-facing interface by which the client calls the API to access back-end resources. A <b>Method</b> resource is integrated with an <a>Integration</a> resource. Both consist of a request and one or more responses. The method request takes the client input that is passed to the back end through the integration request. A method response returns the output from the back end to the client through an integration response. A method request is embodied in a <b>Method</b> resource, whereas an integration request is embodied in an <a>Integration</a> resource. On the other hand, a method response is represented by a <a>MethodResponse</a> resource, whereas an integration response is represented by an <a>IntegrationResponse</a> resource. </p> <div class="remarks"> <p/> <h4>Example: Retrive the GET method on a specified resource</h4> <h5>Request</h5> <p>The following example request retrieves the information about the GET method on an API resource (<code>3kzxbg5sa2</code>) of an API (<code>fugvjdxtri</code>). </p> <pre><code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T210259Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code></pre> <h5>Response</h5> <p>The successful response returns a <code>200 OK</code> status code and a payload similar to the following:</p> <pre><code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-{rel}.html", "name": "method", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true } ], "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET", "name": "GET", "title": "GET" }, "integration:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "method:integration": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "method:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "methodresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/{status_code}", "templated": true } }, "apiKeyRequired": true, "authorizationType": "NONE", "httpMethod": "GET", "_embedded": { "method:integration": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "3kzxbg5sa2", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestParameters": { "integration.request.header.Content-Type": "'application/x-amz-json-1.1'" }, "requestTemplates": { "application/json": "{\n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-east-1:kinesis:action/ListStreams", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E\")" }, "statusCode": "200" } } }, "method:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" } } }</code></pre> <p>In the example above, the response template for the <code>200 OK</code> response maps the JSON output from the <code>ListStreams</code> action in the back end to an XML output. The mapping template is URL-encoded as <code>%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E</code> and the output is decoded using the <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#util-templat-reference">$util.urlDecode()</a> helper function.</p> </div> <div class="seeAlso"> <a>MethodResponse</a>, <a>Integration</a>, <a>IntegrationResponse</a>, <a>Resource</a>, <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-method-settings.html">Set up an API's method</a> </div>
   */
  @js.native
  trait Method extends js.Object {
    var requestParameters: js.UndefOr[MapOfStringToBoolean]
    var authorizationScopes: js.UndefOr[ListOfString]
    var requestValidatorId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var methodResponses: js.UndefOr[MapOfMethodResponse]
    var authorizerId: js.UndefOr[String]
    var authorizationType: js.UndefOr[String]
    var requestModels: js.UndefOr[MapOfStringToString]
    var operationName: js.UndefOr[String]
    var methodIntegration: js.UndefOr[Integration]
    var apiKeyRequired: js.UndefOr[NullableBoolean]
  }

  object Method {
    def apply(
      requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
      authorizationScopes: js.UndefOr[ListOfString] = js.undefined,
      requestValidatorId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      methodResponses: js.UndefOr[MapOfMethodResponse] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined,
      authorizationType: js.UndefOr[String] = js.undefined,
      requestModels: js.UndefOr[MapOfStringToString] = js.undefined,
      operationName: js.UndefOr[String] = js.undefined,
      methodIntegration: js.UndefOr[Integration] = js.undefined,
      apiKeyRequired: js.UndefOr[NullableBoolean] = js.undefined): Method = {
      val _fields = IndexedSeq[(String, js.Any)](
        "requestParameters" -> requestParameters.map { x => x.asInstanceOf[js.Any] },
        "authorizationScopes" -> authorizationScopes.map { x => x.asInstanceOf[js.Any] },
        "requestValidatorId" -> requestValidatorId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "methodResponses" -> methodResponses.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] },
        "authorizationType" -> authorizationType.map { x => x.asInstanceOf[js.Any] },
        "requestModels" -> requestModels.map { x => x.asInstanceOf[js.Any] },
        "operationName" -> operationName.map { x => x.asInstanceOf[js.Any] },
        "methodIntegration" -> methodIntegration.map { x => x.asInstanceOf[js.Any] },
        "apiKeyRequired" -> apiKeyRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Method]
    }
  }

  /**
   * <p>Represents a method response of a given HTTP status code returned to the client. The method response is passed from the back end through the associated integration response that can be transformed using a mapping template. </p> <div class="remarks"> <p/> <h4>Example: A <b>MethodResponse</b> instance of an API</h4> <h5>Request</h5> <p>The example request retrieves a <b>MethodResponse</b> of the 200 status code.</p> <pre><code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T222952Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code></pre> <h5>Response</h5> <p>The successful response returns <code>200 OK</code> status and a payload as follows:</p> <pre><code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" }</code></pre> <p/> </div> <div class="seeAlso"> <a>Method</a>, <a>IntegrationResponse</a>, <a>Integration</a> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a> </div>
   */
  @js.native
  trait MethodResponse extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
    var responseModels: js.UndefOr[MapOfStringToString]
  }

  object MethodResponse {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
      responseModels: js.UndefOr[MapOfStringToString] = js.undefined): MethodResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "responseModels" -> responseModels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MethodResponse]
    }
  }

  /**
   * <p>Specifies the method setting properties.</p>
   */
  @js.native
  trait MethodSetting extends js.Object {
    var cacheTtlInSeconds: js.UndefOr[Int]
    var throttlingBurstLimit: js.UndefOr[Int]
    var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy]
    var dataTraceEnabled: js.UndefOr[Boolean]
    var loggingLevel: js.UndefOr[String]
    var throttlingRateLimit: js.UndefOr[Double]
    var requireAuthorizationForCacheControl: js.UndefOr[Boolean]
    var cacheDataEncrypted: js.UndefOr[Boolean]
    var cachingEnabled: js.UndefOr[Boolean]
    var metricsEnabled: js.UndefOr[Boolean]
  }

  object MethodSetting {
    def apply(
      cacheTtlInSeconds: js.UndefOr[Int] = js.undefined,
      throttlingBurstLimit: js.UndefOr[Int] = js.undefined,
      unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.undefined,
      dataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
      loggingLevel: js.UndefOr[String] = js.undefined,
      throttlingRateLimit: js.UndefOr[Double] = js.undefined,
      requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
      cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
      cachingEnabled: js.UndefOr[Boolean] = js.undefined,
      metricsEnabled: js.UndefOr[Boolean] = js.undefined): MethodSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cacheTtlInSeconds" -> cacheTtlInSeconds.map { x => x.asInstanceOf[js.Any] },
        "throttlingBurstLimit" -> throttlingBurstLimit.map { x => x.asInstanceOf[js.Any] },
        "unauthorizedCacheControlHeaderStrategy" -> unauthorizedCacheControlHeaderStrategy.map { x => x.asInstanceOf[js.Any] },
        "dataTraceEnabled" -> dataTraceEnabled.map { x => x.asInstanceOf[js.Any] },
        "loggingLevel" -> loggingLevel.map { x => x.asInstanceOf[js.Any] },
        "throttlingRateLimit" -> throttlingRateLimit.map { x => x.asInstanceOf[js.Any] },
        "requireAuthorizationForCacheControl" -> requireAuthorizationForCacheControl.map { x => x.asInstanceOf[js.Any] },
        "cacheDataEncrypted" -> cacheDataEncrypted.map { x => x.asInstanceOf[js.Any] },
        "cachingEnabled" -> cachingEnabled.map { x => x.asInstanceOf[js.Any] },
        "metricsEnabled" -> metricsEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MethodSetting]
    }
  }

  /**
   * <p>Represents a summary of a <a>Method</a> resource, given a particular date and time.</p>
   */
  @js.native
  trait MethodSnapshot extends js.Object {
    var authorizationType: js.UndefOr[String]
    var apiKeyRequired: js.UndefOr[Boolean]
  }

  object MethodSnapshot {
    def apply(
      authorizationType: js.UndefOr[String] = js.undefined,
      apiKeyRequired: js.UndefOr[Boolean] = js.undefined): MethodSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizationType" -> authorizationType.map { x => x.asInstanceOf[js.Any] },
        "apiKeyRequired" -> apiKeyRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MethodSnapshot]
    }
  }

  /**
   * <p>Represents the data structure of a method's request or response payload.</p> <div class="remarks"> <p>A request model defines the data structure of the client-supplied request payload. A response model defines the data structure of the response payload returned by the back end. Although not required, models are useful for mapping payloads between the front end and back end.</p> <p>A model is used for generating an API's SDK, validating the input request body, and creating a skeletal mapping template.</p> </div> <div class="seeAlso"> <a>Method</a>, <a>MethodResponse</a>, <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html">Models and Mappings</a> </div>
   */
  @js.native
  trait Model extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var schema: js.UndefOr[String]
    var contentType: js.UndefOr[String]
  }

  object Model {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      schema: js.UndefOr[String] = js.undefined,
      contentType: js.UndefOr[String] = js.undefined): Model = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "schema" -> schema.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Model]
    }
  }

  /**
   * <p>Represents a collection of <a>Model</a> resources.</p> <div class="seeAlso"> <a>Method</a>, <a>MethodResponse</a>, <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html">Models and Mappings</a> </div>
   */
  @js.native
  trait Models extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfModel]
  }

  object Models {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfModel] = js.undefined): Models = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Models]
    }
  }

  object OpEnum {
    val add = "add"
    val remove = "remove"
    val replace = "replace"
    val move = "move"
    val copy = "copy"
    val test = "test"

    val values = IndexedSeq(add, remove, replace, move, copy, test)
  }

  /**
   * A single patch operation to apply to the specified resource. Please refer to http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each operation is used.
   */
  @js.native
  trait PatchOperation extends js.Object {
    var op: js.UndefOr[Op]
    var path: js.UndefOr[String]
    var value: js.UndefOr[String]
    var from: js.UndefOr[String]
  }

  object PatchOperation {
    def apply(
      op: js.UndefOr[Op] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      from: js.UndefOr[String] = js.undefined): PatchOperation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "op" -> op.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "from" -> from.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PatchOperation]
    }
  }

  /**
   * <p>Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given <a>RestApi</a>.</p>
   */
  @js.native
  trait PutGatewayResponseRequest extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseType: js.UndefOr[GatewayResponseType]
    var restApiId: js.UndefOr[String]
    var responseTemplates: js.UndefOr[MapOfStringToString]
  }

  object PutGatewayResponseRequest {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      responseType: js.UndefOr[GatewayResponseType] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined): PutGatewayResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "responseType" -> responseType.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "responseTemplates" -> responseTemplates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutGatewayResponseRequest]
    }
  }

  /**
   * <p>Sets up a method's integration.</p>
   */
  @js.native
  trait PutIntegrationRequest extends js.Object {
    var integrationHttpMethod: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var requestParameters: js.UndefOr[MapOfStringToString]
    var timeoutInMillis: js.UndefOr[NullableInteger]
    var uri: js.UndefOr[String]
    var cacheKeyParameters: js.UndefOr[ListOfString]
    var httpMethod: js.UndefOr[String]
    var requestTemplates: js.UndefOr[MapOfStringToString]
    var cacheNamespace: js.UndefOr[String]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var connectionId: js.UndefOr[String]
    var `type`: js.UndefOr[IntegrationType]
    var passthroughBehavior: js.UndefOr[String]
    var credentials: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var connectionType: js.UndefOr[ConnectionType]
  }

  object PutIntegrationRequest {
    def apply(
      integrationHttpMethod: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      requestParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      timeoutInMillis: js.UndefOr[NullableInteger] = js.undefined,
      uri: js.UndefOr[String] = js.undefined,
      cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
      cacheNamespace: js.UndefOr[String] = js.undefined,
      contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
      connectionId: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[IntegrationType] = js.undefined,
      passthroughBehavior: js.UndefOr[String] = js.undefined,
      credentials: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      connectionType: js.UndefOr[ConnectionType] = js.undefined): PutIntegrationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "integrationHttpMethod" -> integrationHttpMethod.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "requestParameters" -> requestParameters.map { x => x.asInstanceOf[js.Any] },
        "timeoutInMillis" -> timeoutInMillis.map { x => x.asInstanceOf[js.Any] },
        "uri" -> uri.map { x => x.asInstanceOf[js.Any] },
        "cacheKeyParameters" -> cacheKeyParameters.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "requestTemplates" -> requestTemplates.map { x => x.asInstanceOf[js.Any] },
        "cacheNamespace" -> cacheNamespace.map { x => x.asInstanceOf[js.Any] },
        "contentHandling" -> contentHandling.map { x => x.asInstanceOf[js.Any] },
        "connectionId" -> connectionId.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "passthroughBehavior" -> passthroughBehavior.map { x => x.asInstanceOf[js.Any] },
        "credentials" -> credentials.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "connectionType" -> connectionType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIntegrationRequest]
    }
  }

  /**
   * <p>Represents a put integration response request.</p>
   */
  @js.native
  trait PutIntegrationResponseRequest extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var selectionPattern: js.UndefOr[String]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var restApiId: js.UndefOr[String]
    var responseTemplates: js.UndefOr[MapOfStringToString]
  }

  object PutIntegrationResponseRequest {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      selectionPattern: js.UndefOr[String] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
      contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined): PutIntegrationResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "selectionPattern" -> selectionPattern.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "contentHandling" -> contentHandling.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "responseTemplates" -> responseTemplates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIntegrationResponseRequest]
    }
  }

  /**
   * <p>Request to add a method to an existing <a>Resource</a> resource.</p>
   */
  @js.native
  trait PutMethodRequest extends js.Object {
    var resourceId: js.UndefOr[String]
    var requestParameters: js.UndefOr[MapOfStringToBoolean]
    var authorizationScopes: js.UndefOr[ListOfString]
    var requestValidatorId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var authorizerId: js.UndefOr[String]
    var authorizationType: js.UndefOr[String]
    var requestModels: js.UndefOr[MapOfStringToString]
    var operationName: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var apiKeyRequired: js.UndefOr[Boolean]
  }

  object PutMethodRequest {
    def apply(
      resourceId: js.UndefOr[String] = js.undefined,
      requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
      authorizationScopes: js.UndefOr[ListOfString] = js.undefined,
      requestValidatorId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined,
      authorizationType: js.UndefOr[String] = js.undefined,
      requestModels: js.UndefOr[MapOfStringToString] = js.undefined,
      operationName: js.UndefOr[String] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined,
      apiKeyRequired: js.UndefOr[Boolean] = js.undefined): PutMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "requestParameters" -> requestParameters.map { x => x.asInstanceOf[js.Any] },
        "authorizationScopes" -> authorizationScopes.map { x => x.asInstanceOf[js.Any] },
        "requestValidatorId" -> requestValidatorId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] },
        "authorizationType" -> authorizationType.map { x => x.asInstanceOf[js.Any] },
        "requestModels" -> requestModels.map { x => x.asInstanceOf[js.Any] },
        "operationName" -> operationName.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "apiKeyRequired" -> apiKeyRequired.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMethodRequest]
    }
  }

  /**
   * <p>Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.</p>
   */
  @js.native
  trait PutMethodResponseRequest extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var resourceId: js.UndefOr[String]
    var responseModels: js.UndefOr[MapOfStringToString]
    var httpMethod: js.UndefOr[String]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
    var restApiId: js.UndefOr[String]
  }

  object PutMethodResponseRequest {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      responseModels: js.UndefOr[MapOfStringToString] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): PutMethodResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "responseModels" -> responseModels.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "responseParameters" -> responseParameters.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutMethodResponseRequest]
    }
  }

  object PutModeEnum {
    val merge = "merge"
    val overwrite = "overwrite"

    val values = IndexedSeq(merge, overwrite)
  }

  /**
   * <p>A PUT request to update an existing API, with external API definitions specified as the request body.</p>
   */
  @js.native
  trait PutRestApiRequest extends js.Object {
    var body: js.UndefOr[Blob]
    var failOnWarnings: js.UndefOr[Boolean]
    var mode: js.UndefOr[PutMode]
    var parameters: js.UndefOr[MapOfStringToString]
    var restApiId: js.UndefOr[String]
  }

  object PutRestApiRequest {
    def apply(
      body: js.UndefOr[Blob] = js.undefined,
      failOnWarnings: js.UndefOr[Boolean] = js.undefined,
      mode: js.UndefOr[PutMode] = js.undefined,
      parameters: js.UndefOr[MapOfStringToString] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): PutRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "failOnWarnings" -> failOnWarnings.map { x => x.asInstanceOf[js.Any] },
        "mode" -> mode.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutRestApiRequest]
    }
  }

  object QuotaPeriodTypeEnum {
    val DAY = "DAY"
    val WEEK = "WEEK"
    val MONTH = "MONTH"

    val values = IndexedSeq(DAY, WEEK, MONTH)
  }

  /**
   * <p>Quotas configured for a usage plan.</p>
   */
  @js.native
  trait QuotaSettings extends js.Object {
    var limit: js.UndefOr[Int]
    var offset: js.UndefOr[Int]
    var period: js.UndefOr[QuotaPeriodType]
  }

  object QuotaSettings {
    def apply(
      limit: js.UndefOr[Int] = js.undefined,
      offset: js.UndefOr[Int] = js.undefined,
      period: js.UndefOr[QuotaPeriodType] = js.undefined): QuotaSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "offset" -> offset.map { x => x.asInstanceOf[js.Any] },
        "period" -> period.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QuotaSettings]
    }
  }

  /**
   * <p>A set of validation rules for incoming <a>Method</a> requests.</p> <div class="remarks"> <p>In OpenAPI, a <a>RequestValidator</a> of an API is defined by the <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.requestValidator.html">x-amazon-apigateway-request-validators.requestValidator</a> object. It the referenced using the <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validator">x-amazon-apigateway-request-validator</a> property.</p> </div> <div class="seeAlso"><a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html">Enable Basic Request Validation in API Gateway</a></div>
   */
  @js.native
  trait RequestValidator extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  object RequestValidator {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      validateRequestBody: js.UndefOr[Boolean] = js.undefined,
      validateRequestParameters: js.UndefOr[Boolean] = js.undefined): RequestValidator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "validateRequestBody" -> validateRequestBody.map { x => x.asInstanceOf[js.Any] },
        "validateRequestParameters" -> validateRequestParameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestValidator]
    }
  }

  /**
   * <p>A collection of <a>RequestValidator</a> resources of a given <a>RestApi</a>.</p> <div class="remarks"> <p>In OpenAPI, the <a>RequestValidators</a> of an API is defined by the <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.html">x-amazon-apigateway-request-validators</a> extension.</p> </div> <div class="seeAlso"><a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html">Enable Basic Request Validation in API Gateway</a></div>
   */
  @js.native
  trait RequestValidators extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfRequestValidator]
  }

  object RequestValidators {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfRequestValidator] = js.undefined): RequestValidators = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestValidators]
    }
  }

  /**
   * <p>Represents an API resource.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Create an API</a> </div>
   */
  @js.native
  trait Resource extends js.Object {
    var path: js.UndefOr[String]
    var resourceMethods: js.UndefOr[MapOfMethod]
    var id: js.UndefOr[String]
    var pathPart: js.UndefOr[String]
    var parentId: js.UndefOr[String]
  }

  object Resource {
    def apply(
      path: js.UndefOr[String] = js.undefined,
      resourceMethods: js.UndefOr[MapOfMethod] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      pathPart: js.UndefOr[String] = js.undefined,
      parentId: js.UndefOr[String] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "resourceMethods" -> resourceMethods.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "pathPart" -> pathPart.map { x => x.asInstanceOf[js.Any] },
        "parentId" -> parentId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p>Represents a collection of <a>Resource</a> resources.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Create an API</a> </div>
   */
  @js.native
  trait Resources extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfResource]
  }

  object Resources {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfResource] = js.undefined): Resources = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resources]
    }
  }

  /**
   * <p>Represents a REST API.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Create an API</a> </div>
   */
  @js.native
  trait RestApi extends js.Object {
    var name: js.UndefOr[String]
    var apiKeySource: js.UndefOr[ApiKeySourceType]
    var description: js.UndefOr[String]
    var binaryMediaTypes: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
    var version: js.UndefOr[String]
    var id: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var policy: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var minimumCompressionSize: js.UndefOr[NullableInteger]
  }

  object RestApi {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined,
      warnings: js.UndefOr[ListOfString] = js.undefined,
      version: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
      policy: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined,
      minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined): RestApi = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "apiKeySource" -> apiKeySource.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "binaryMediaTypes" -> binaryMediaTypes.map { x => x.asInstanceOf[js.Any] },
        "warnings" -> warnings.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "endpointConfiguration" -> endpointConfiguration.map { x => x.asInstanceOf[js.Any] },
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "minimumCompressionSize" -> minimumCompressionSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestApi]
    }
  }

  /**
   * <p>Contains references to your APIs and links that guide you in how to interact with your collection. A collection offers a paginated view of your APIs.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Create an API</a> </div>
   */
  @js.native
  trait RestApis extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfRestApi]
  }

  object RestApis {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfRestApi] = js.undefined): RestApis = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestApis]
    }
  }

  /**
   * <p>A configuration property of an SDK type.</p>
   */
  @js.native
  trait SdkConfigurationProperty extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var required: js.UndefOr[Boolean]
    var defaultValue: js.UndefOr[String]
  }

  object SdkConfigurationProperty {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      friendlyName: js.UndefOr[String] = js.undefined,
      required: js.UndefOr[Boolean] = js.undefined,
      defaultValue: js.UndefOr[String] = js.undefined): SdkConfigurationProperty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "friendlyName" -> friendlyName.map { x => x.asInstanceOf[js.Any] },
        "required" -> required.map { x => x.asInstanceOf[js.Any] },
        "defaultValue" -> defaultValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SdkConfigurationProperty]
    }
  }

  /**
   * <p>The binary blob response to <a>GetSdk</a>, which contains the generated SDK.</p>
   */
  @js.native
  trait SdkResponse extends js.Object {
    var contentType: js.UndefOr[String]
    var contentDisposition: js.UndefOr[String]
    var body: js.UndefOr[Blob]
  }

  object SdkResponse {
    def apply(
      contentType: js.UndefOr[String] = js.undefined,
      contentDisposition: js.UndefOr[String] = js.undefined,
      body: js.UndefOr[Blob] = js.undefined): SdkResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "contentDisposition" -> contentDisposition.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SdkResponse]
    }
  }

  /**
   * <p>A type of SDK that API Gateway can generate.</p>
   */
  @js.native
  trait SdkType extends js.Object {
    var id: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var description: js.UndefOr[String]
    var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty]
  }

  object SdkType {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      friendlyName: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.undefined): SdkType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "friendlyName" -> friendlyName.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "configurationProperties" -> configurationProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SdkType]
    }
  }

  /**
   * <p>The collection of <a>SdkType</a> instances.</p>
   */
  @js.native
  trait SdkTypes extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfSdkType]
  }

  object SdkTypes {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfSdkType] = js.undefined): SdkTypes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SdkTypes]
    }
  }

  /**
   * <p>Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html">Deploy an API</a> </div>
   */
  @js.native
  trait Stage extends js.Object {
    var clientCertificateId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var cacheClusterStatus: js.UndefOr[CacheClusterStatus]
    var tags: js.UndefOr[MapOfStringToString]
    var tracingEnabled: js.UndefOr[Boolean]
    var deploymentId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var variables: js.UndefOr[MapOfStringToString]
    var canarySettings: js.UndefOr[CanarySettings]
    var cacheClusterEnabled: js.UndefOr[Boolean]
    var stageName: js.UndefOr[String]
    var accessLogSettings: js.UndefOr[AccessLogSettings]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var methodSettings: js.UndefOr[MapOfMethodSettings]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var webAclArn: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
  }

  object Stage {
    def apply(
      clientCertificateId: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.undefined,
      tags: js.UndefOr[MapOfStringToString] = js.undefined,
      tracingEnabled: js.UndefOr[Boolean] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined,
      variables: js.UndefOr[MapOfStringToString] = js.undefined,
      canarySettings: js.UndefOr[CanarySettings] = js.undefined,
      cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      accessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      methodSettings: js.UndefOr[MapOfMethodSettings] = js.undefined,
      cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
      webAclArn: js.UndefOr[String] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): Stage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterStatus" -> cacheClusterStatus.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "tracingEnabled" -> tracingEnabled.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] },
        "variables" -> variables.map { x => x.asInstanceOf[js.Any] },
        "canarySettings" -> canarySettings.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterEnabled" -> cacheClusterEnabled.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "accessLogSettings" -> accessLogSettings.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "methodSettings" -> methodSettings.map { x => x.asInstanceOf[js.Any] },
        "cacheClusterSize" -> cacheClusterSize.map { x => x.asInstanceOf[js.Any] },
        "webAclArn" -> webAclArn.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stage]
    }
  }

  /**
   * <p>A reference to a unique stage identified in the format <code>{restApiId}/{stage}</code>.</p>
   */
  @js.native
  trait StageKey extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object StageKey {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined): StageKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StageKey]
    }
  }

  /**
   * <p>A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.</p> <div class="seeAlso"><a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/stages.html">Deploying API in Stages</a></div>
   */
  @js.native
  trait Stages extends js.Object {
    var item: js.UndefOr[ListOfStage]
  }

  object Stages {
    def apply(
      item: js.UndefOr[ListOfStage] = js.undefined): Stages = {
      val _fields = IndexedSeq[(String, js.Any)](
        "item" -> item.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Stages]
    }
  }

  /**
   * <p>Adds or updates a tag on a given resource.</p>
   */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  object TagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[MapOfStringToString] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
   * <p>The collection of tags. Each tag element is associated with a given resource.</p>
   */
  @js.native
  trait Tags extends js.Object {
    var tags: js.UndefOr[MapOfStringToString]
  }

  object Tags {
    def apply(
      tags: js.UndefOr[MapOfStringToString] = js.undefined): Tags = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tags]
    }
  }

  /**
   * <p>Represents a mapping template used to transform a payload.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-mappings">Mapping Templates</a> </div>
   */
  @js.native
  trait Template extends js.Object {
    var value: js.UndefOr[String]
  }

  object Template {
    def apply(
      value: js.UndefOr[String] = js.undefined): Template = {
      val _fields = IndexedSeq[(String, js.Any)](
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Template]
    }
  }

  /**
   * <p>Make a request to simulate the execution of an <a>Authorizer</a>.</p>
   */
  @js.native
  trait TestInvokeAuthorizerRequest extends js.Object {
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var body: js.UndefOr[String]
    var pathWithQueryString: js.UndefOr[String]
    var additionalContext: js.UndefOr[MapOfStringToString]
    var authorizerId: js.UndefOr[String]
    var stageVariables: js.UndefOr[MapOfStringToString]
    var headers: js.UndefOr[MapOfStringToString]
    var restApiId: js.UndefOr[String]
  }

  object TestInvokeAuthorizerRequest {
    def apply(
      multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      pathWithQueryString: js.UndefOr[String] = js.undefined,
      additionalContext: js.UndefOr[MapOfStringToString] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined,
      stageVariables: js.UndefOr[MapOfStringToString] = js.undefined,
      headers: js.UndefOr[MapOfStringToString] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): TestInvokeAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "multiValueHeaders" -> multiValueHeaders.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "pathWithQueryString" -> pathWithQueryString.map { x => x.asInstanceOf[js.Any] },
        "additionalContext" -> additionalContext.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] },
        "stageVariables" -> stageVariables.map { x => x.asInstanceOf[js.Any] },
        "headers" -> headers.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerRequest]
    }
  }

  /**
   * <p>Represents the response of the test invoke request for a custom <a>Authorizer</a></p>
   */
  @js.native
  trait TestInvokeAuthorizerResponse extends js.Object {
    var clientStatus: js.UndefOr[Int]
    var principalId: js.UndefOr[String]
    var latency: js.UndefOr[Double]
    var authorization: js.UndefOr[MapOfStringToList]
    var claims: js.UndefOr[MapOfStringToString]
    var policy: js.UndefOr[String]
    var log: js.UndefOr[String]
  }

  object TestInvokeAuthorizerResponse {
    def apply(
      clientStatus: js.UndefOr[Int] = js.undefined,
      principalId: js.UndefOr[String] = js.undefined,
      latency: js.UndefOr[Double] = js.undefined,
      authorization: js.UndefOr[MapOfStringToList] = js.undefined,
      claims: js.UndefOr[MapOfStringToString] = js.undefined,
      policy: js.UndefOr[String] = js.undefined,
      log: js.UndefOr[String] = js.undefined): TestInvokeAuthorizerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientStatus" -> clientStatus.map { x => x.asInstanceOf[js.Any] },
        "principalId" -> principalId.map { x => x.asInstanceOf[js.Any] },
        "latency" -> latency.map { x => x.asInstanceOf[js.Any] },
        "authorization" -> authorization.map { x => x.asInstanceOf[js.Any] },
        "claims" -> claims.map { x => x.asInstanceOf[js.Any] },
        "policy" -> policy.map { x => x.asInstanceOf[js.Any] },
        "log" -> log.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeAuthorizerResponse]
    }
  }

  /**
   * <p>Make a request to simulate the execution of a <a>Method</a>.</p>
   */
  @js.native
  trait TestInvokeMethodRequest extends js.Object {
    var resourceId: js.UndefOr[String]
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var body: js.UndefOr[String]
    var pathWithQueryString: js.UndefOr[String]
    var clientCertificateId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var stageVariables: js.UndefOr[MapOfStringToString]
    var headers: js.UndefOr[MapOfStringToString]
    var restApiId: js.UndefOr[String]
  }

  object TestInvokeMethodRequest {
    def apply(
      resourceId: js.UndefOr[String] = js.undefined,
      multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      pathWithQueryString: js.UndefOr[String] = js.undefined,
      clientCertificateId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      stageVariables: js.UndefOr[MapOfStringToString] = js.undefined,
      headers: js.UndefOr[MapOfStringToString] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): TestInvokeMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "multiValueHeaders" -> multiValueHeaders.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "pathWithQueryString" -> pathWithQueryString.map { x => x.asInstanceOf[js.Any] },
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "stageVariables" -> stageVariables.map { x => x.asInstanceOf[js.Any] },
        "headers" -> headers.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeMethodRequest]
    }
  }

  /**
   * <p>Represents the response of the test invoke request in the HTTP method.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-test-method.html#how-to-test-method-console">Test API using the API Gateway console</a> </div>
   */
  @js.native
  trait TestInvokeMethodResponse extends js.Object {
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var body: js.UndefOr[String]
    var latency: js.UndefOr[Double]
    var status: js.UndefOr[Int]
    var headers: js.UndefOr[MapOfStringToString]
    var log: js.UndefOr[String]
  }

  object TestInvokeMethodResponse {
    def apply(
      multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      latency: js.UndefOr[Double] = js.undefined,
      status: js.UndefOr[Int] = js.undefined,
      headers: js.UndefOr[MapOfStringToString] = js.undefined,
      log: js.UndefOr[String] = js.undefined): TestInvokeMethodResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "multiValueHeaders" -> multiValueHeaders.map { x => x.asInstanceOf[js.Any] },
        "body" -> body.map { x => x.asInstanceOf[js.Any] },
        "latency" -> latency.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "headers" -> headers.map { x => x.asInstanceOf[js.Any] },
        "log" -> log.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestInvokeMethodResponse]
    }
  }

  /**
   * <p> The API request rate limits.</p>
   */
  @js.native
  trait ThrottleSettings extends js.Object {
    var burstLimit: js.UndefOr[Int]
    var rateLimit: js.UndefOr[Double]
  }

  object ThrottleSettings {
    def apply(
      burstLimit: js.UndefOr[Int] = js.undefined,
      rateLimit: js.UndefOr[Double] = js.undefined): ThrottleSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "burstLimit" -> burstLimit.map { x => x.asInstanceOf[js.Any] },
        "rateLimit" -> rateLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ThrottleSettings]
    }
  }

  object UnauthorizedCacheControlHeaderStrategyEnum {
    val FAIL_WITH_403 = "FAIL_WITH_403"
    val SUCCEED_WITH_RESPONSE_HEADER = "SUCCEED_WITH_RESPONSE_HEADER"
    val SUCCEED_WITHOUT_RESPONSE_HEADER = "SUCCEED_WITHOUT_RESPONSE_HEADER"

    val values = IndexedSeq(FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER)
  }

  /**
   * <p>Removes a tag from a given resource.</p>
   */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: js.UndefOr[String]
    var tagKeys: js.UndefOr[ListOfString]
  }

  object UntagResourceRequest {
    def apply(
      resourceArn: js.UndefOr[String] = js.undefined,
      tagKeys: js.UndefOr[ListOfString] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resourceArn" -> resourceArn.map { x => x.asInstanceOf[js.Any] },
        "tagKeys" -> tagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  /**
   * <p>Requests API Gateway to change information about the current <a>Account</a> resource.</p>
   */
  @js.native
  trait UpdateAccountRequest extends js.Object {
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateAccountRequest {
    def apply(
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAccountRequest]
    }
  }

  /**
   * <p>A request to change information about an <a>ApiKey</a> resource.</p>
   */
  @js.native
  trait UpdateApiKeyRequest extends js.Object {
    var apiKey: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateApiKeyRequest {
    def apply(
      apiKey: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKey" -> apiKey.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApiKeyRequest]
    }
  }

  /**
   * <p>Request to update an existing <a>Authorizer</a> resource.</p>
   */
  @js.native
  trait UpdateAuthorizerRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var authorizerId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateAuthorizerRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      authorizerId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateAuthorizerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "authorizerId" -> authorizerId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  /**
   * <p>A request to change information about the <a>BasePathMapping</a> resource.</p>
   */
  @js.native
  trait UpdateBasePathMappingRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var basePath: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateBasePathMappingRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      basePath: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateBasePathMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "basePath" -> basePath.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBasePathMappingRequest]
    }
  }

  /**
   * <p>A request to change information about an <a>ClientCertificate</a> resource.</p>
   */
  @js.native
  trait UpdateClientCertificateRequest extends js.Object {
    var clientCertificateId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateClientCertificateRequest {
    def apply(
      clientCertificateId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateClientCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientCertificateId" -> clientCertificateId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClientCertificateRequest]
    }
  }

  /**
   * <p>Requests API Gateway to change information about a <a>Deployment</a> resource.</p>
   */
  @js.native
  trait UpdateDeploymentRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var deploymentId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDeploymentRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      deploymentId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "deploymentId" -> deploymentId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeploymentRequest]
    }
  }

  /**
   * <p>Updates an existing documentation part of a given API.</p>
   */
  @js.native
  trait UpdateDocumentationPartRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationPartId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDocumentationPartRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationPartId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateDocumentationPartRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationPartId" -> documentationPartId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentationPartRequest]
    }
  }

  /**
   * <p>Updates an existing documentation version of an API.</p>
   */
  @js.native
  trait UpdateDocumentationVersionRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDocumentationVersionRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      documentationVersion: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateDocumentationVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "documentationVersion" -> documentationVersion.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDocumentationVersionRequest]
    }
  }

  /**
   * <p>A request to change information about the <a>DomainName</a> resource.</p>
   */
  @js.native
  trait UpdateDomainNameRequest extends js.Object {
    var domainName: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDomainNameRequest {
    def apply(
      domainName: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateDomainNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainNameRequest]
    }
  }

  /**
   * <p>Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.</p>
   */
  @js.native
  trait UpdateGatewayResponseRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var responseType: js.UndefOr[GatewayResponseType]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateGatewayResponseRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      responseType: js.UndefOr[GatewayResponseType] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateGatewayResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "responseType" -> responseType.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayResponseRequest]
    }
  }

  /**
   * <p>Represents an update integration request.</p>
   */
  @js.native
  trait UpdateIntegrationRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateIntegrationRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateIntegrationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIntegrationRequest]
    }
  }

  /**
   * <p>Represents an update integration response request.</p>
   */
  @js.native
  trait UpdateIntegrationResponseRequest extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
    var restApiId: js.UndefOr[String]
  }

  object UpdateIntegrationResponseRequest {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): UpdateIntegrationResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIntegrationResponseRequest]
    }
  }

  /**
   * <p>Request to update an existing <a>Method</a> resource.</p>
   */
  @js.native
  trait UpdateMethodRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateMethodRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMethodRequest]
    }
  }

  /**
   * <p>A request to update an existing <a>MethodResponse</a> resource.</p>
   */
  @js.native
  trait UpdateMethodResponseRequest extends js.Object {
    var statusCode: js.UndefOr[StatusCode]
    var resourceId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
    var restApiId: js.UndefOr[String]
  }

  object UpdateMethodResponseRequest {
    def apply(
      statusCode: js.UndefOr[StatusCode] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      httpMethod: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined,
      restApiId: js.UndefOr[String] = js.undefined): UpdateMethodResponseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusCode" -> statusCode.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "httpMethod" -> httpMethod.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] },
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMethodResponseRequest]
    }
  }

  /**
   * <p>Request to update an existing model in an existing <a>RestApi</a> resource.</p>
   */
  @js.native
  trait UpdateModelRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var modelName: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateModelRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      modelName: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateModelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "modelName" -> modelName.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateModelRequest]
    }
  }

  /**
   * <p>Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.</p>
   */
  @js.native
  trait UpdateRequestValidatorRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var requestValidatorId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateRequestValidatorRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      requestValidatorId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateRequestValidatorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "requestValidatorId" -> requestValidatorId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRequestValidatorRequest]
    }
  }

  /**
   * <p>Request to change information about a <a>Resource</a> resource.</p>
   */
  @js.native
  trait UpdateResourceRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var resourceId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateResourceRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      resourceId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "resourceId" -> resourceId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceRequest]
    }
  }

  /**
   * <p>Request to update an existing <a>RestApi</a> resource in your collection.</p>
   */
  @js.native
  trait UpdateRestApiRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateRestApiRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateRestApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRestApiRequest]
    }
  }

  /**
   * <p>Requests API Gateway to change information about a <a>Stage</a> resource.</p>
   */
  @js.native
  trait UpdateStageRequest extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateStageRequest {
    def apply(
      restApiId: js.UndefOr[String] = js.undefined,
      stageName: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateStageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "restApiId" -> restApiId.map { x => x.asInstanceOf[js.Any] },
        "stageName" -> stageName.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateStageRequest]
    }
  }

  /**
   * <p>The PATCH request to update a usage plan of a given plan Id.</p>
   */
  @js.native
  trait UpdateUsagePlanRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateUsagePlanRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateUsagePlanRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUsagePlanRequest]
    }
  }

  /**
   * <p>The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key.</p>
   */
  @js.native
  trait UpdateUsageRequest extends js.Object {
    var usagePlanId: js.UndefOr[String]
    var keyId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateUsageRequest {
    def apply(
      usagePlanId: js.UndefOr[String] = js.undefined,
      keyId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "keyId" -> keyId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUsageRequest]
    }
  }

  /**
   * <p>Updates an existing <a>VpcLink</a> of a specified identifier.</p>
   */
  @js.native
  trait UpdateVpcLinkRequest extends js.Object {
    var vpcLinkId: js.UndefOr[String]
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateVpcLinkRequest {
    def apply(
      vpcLinkId: js.UndefOr[String] = js.undefined,
      patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined): UpdateVpcLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpcLinkId" -> vpcLinkId.map { x => x.asInstanceOf[js.Any] },
        "patchOperations" -> patchOperations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVpcLinkRequest]
    }
  }

  /**
   * <p>Represents the usage data of a usage plan.</p> <div class="remarks"/> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage Plans</a>, <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-usage-plans-with-console.html#api-gateway-usage-plan-manage-usage">Manage Usage in a Usage Plan</a> </div>
   */
  @js.native
  trait Usage extends js.Object {
    var endDate: js.UndefOr[String]
    var items: js.UndefOr[MapOfKeyUsages]
    var usagePlanId: js.UndefOr[String]
    var position: js.UndefOr[String]
    var startDate: js.UndefOr[String]
  }

  object Usage {
    def apply(
      endDate: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[MapOfKeyUsages] = js.undefined,
      usagePlanId: js.UndefOr[String] = js.undefined,
      position: js.UndefOr[String] = js.undefined,
      startDate: js.UndefOr[String] = js.undefined): Usage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endDate" -> endDate.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] },
        "usagePlanId" -> usagePlanId.map { x => x.asInstanceOf[js.Any] },
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "startDate" -> startDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Usage]
    }
  }

  /**
   * <p>Represents a usage plan than can specify who can assess associated API stages with specified request limits and quotas.</p> <div class="remarks"> <p>In a usage plan, you associate an API by specifying the API's Id and a stage name of the specified API. You add plan customers by adding API keys to the plan. </p> </div> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage Plans</a> </div>
   */
  @js.native
  trait UsagePlan extends js.Object {
    var name: js.UndefOr[String]
    var quota: js.UndefOr[QuotaSettings]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var apiStages: js.UndefOr[ListOfApiStage]
    var throttle: js.UndefOr[ThrottleSettings]
    var productCode: js.UndefOr[String]
  }

  object UsagePlan {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      quota: js.UndefOr[QuotaSettings] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      apiStages: js.UndefOr[ListOfApiStage] = js.undefined,
      throttle: js.UndefOr[ThrottleSettings] = js.undefined,
      productCode: js.UndefOr[String] = js.undefined): UsagePlan = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "quota" -> quota.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "apiStages" -> apiStages.map { x => x.asInstanceOf[js.Any] },
        "throttle" -> throttle.map { x => x.asInstanceOf[js.Any] },
        "productCode" -> productCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsagePlan]
    }
  }

  /**
   * <p>Represents a usage plan key to identify a plan customer.</p> <div class="remarks"> <p>To associate an API stage with a selected API key in a usage plan, you must create a UsagePlanKey resource to represent the selected <a>ApiKey</a>.</p> </div>" <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage Plans</a> </div>
   */
  @js.native
  trait UsagePlanKey extends js.Object {
    var id: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var value: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object UsagePlanKey {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined): UsagePlanKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsagePlanKey]
    }
  }

  /**
   * <p>Represents the collection of usage plan keys added to usage plans for the associated API keys and, possibly, other types of keys.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage Plans</a> </div>
   */
  @js.native
  trait UsagePlanKeys extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfUsagePlanKey]
  }

  object UsagePlanKeys {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfUsagePlanKey] = js.undefined): UsagePlanKeys = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsagePlanKeys]
    }
  }

  /**
   * <p>Represents a collection of usage plans for an AWS account.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage Plans</a> </div>
   */
  @js.native
  trait UsagePlans extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfUsagePlan]
  }

  object UsagePlans {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfUsagePlan] = js.undefined): UsagePlans = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsagePlans]
    }
  }

  /**
   * <p>A API Gateway VPC link for a <a>RestApi</a> to access resources in an Amazon Virtual Private Cloud (VPC).</p> <div class="remarks"> <p><p>To enable access to a resource in an Amazon Virtual Private Cloud through Amazon API Gateway, you, as an API developer, create a <a>VpcLink</a> resource targeted for one or more network load balancers of the VPC and then integrate an API method with a private integration that uses the <a>VpcLink</a>. The private integration has an integration type of <code>HTTP</code> or <code>HTTP_PROXY</code> and has a connection type of <code>VPC_LINK</code>. The integration uses the <code>connectionId</code> property to identify the <a>VpcLink</a> used.</p> </p> </div>
   */
  @js.native
  trait VpcLink extends js.Object {
    var name: js.UndefOr[String]
    var description: js.UndefOr[String]
    var targetArns: js.UndefOr[ListOfString]
    var id: js.UndefOr[String]
    var status: js.UndefOr[VpcLinkStatus]
    var statusMessage: js.UndefOr[String]
  }

  object VpcLink {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      targetArns: js.UndefOr[ListOfString] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[VpcLinkStatus] = js.undefined,
      statusMessage: js.UndefOr[String] = js.undefined): VpcLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "targetArns" -> targetArns.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusMessage" -> statusMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcLink]
    }
  }

  object VpcLinkStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val PENDING = "PENDING"
    val DELETING = "DELETING"
    val FAILED = "FAILED"

    val values = IndexedSeq(AVAILABLE, PENDING, DELETING, FAILED)
  }

  /**
   * <p>The collection of VPC links under the caller's account in a region.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-with-private-integration.html">Getting Started with Private Integrations</a>, <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-private-integration.html">Set up Private Integrations</a> </div>
   */
  @js.native
  trait VpcLinks extends js.Object {
    var position: js.UndefOr[String]
    var items: js.UndefOr[ListOfVpcLink]
  }

  object VpcLinks {
    def apply(
      position: js.UndefOr[String] = js.undefined,
      items: js.UndefOr[ListOfVpcLink] = js.undefined): VpcLinks = {
      val _fields = IndexedSeq[(String, js.Any)](
        "position" -> position.map { x => x.asInstanceOf[js.Any] },
        "items" -> items.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcLinks]
    }
  }
}

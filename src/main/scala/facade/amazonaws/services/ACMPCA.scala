package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object acmpca {
  type Arn = String
  type AuditReportId = String
  type AuditReportResponseFormat = String
  type AuditReportStatus = String
  type CertificateAuthorities = js.Array[CertificateAuthority]
  type CertificateAuthorityStatus = String
  type CertificateAuthorityType = String
  type CertificateBody = String
  type CertificateBodyBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CertificateChain = String
  type CertificateChainBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CountryCodeString = String
  type CsrBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CsrBody = String
  type DistinguishedNameQualifierString = String
  type FailureReason = String
  type IdempotencyToken = String
  type Integer1To5000 = Int
  type KeyAlgorithm = String
  type MaxResults = Int
  type NextToken = String
  type PermanentDeletionTimeInDays = Int
  type PositiveLong = Double
  type RevocationReason = String
  type SigningAlgorithm = String
  type String128 = String
  type String16 = String
  type String253 = String
  type String3 = String
  type String3To255 = String
  type String40 = String
  type String5 = String
  type String64 = String
  type TStamp = js.Date
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type ValidityPeriodType = String
}

package acmpca {
  @js.native
  @JSImport("aws-sdk", "ACMPCA")
  class ACMPCA(config: AWSConfig) extends js.Object {
    def createCertificateAuthority(params: CreateCertificateAuthorityRequest): Request[CreateCertificateAuthorityResponse] = js.native
    def createCertificateAuthorityAuditReport(params: CreateCertificateAuthorityAuditReportRequest): Request[CreateCertificateAuthorityAuditReportResponse] = js.native
    def deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest): Request[js.Object] = js.native
    def describeCertificateAuthority(params: DescribeCertificateAuthorityRequest): Request[DescribeCertificateAuthorityResponse] = js.native
    def describeCertificateAuthorityAuditReport(params: DescribeCertificateAuthorityAuditReportRequest): Request[DescribeCertificateAuthorityAuditReportResponse] = js.native
    def getCertificate(params: GetCertificateRequest): Request[GetCertificateResponse] = js.native
    def getCertificateAuthorityCertificate(params: GetCertificateAuthorityCertificateRequest): Request[GetCertificateAuthorityCertificateResponse] = js.native
    def getCertificateAuthorityCsr(params: GetCertificateAuthorityCsrRequest): Request[GetCertificateAuthorityCsrResponse] = js.native
    def importCertificateAuthorityCertificate(params: ImportCertificateAuthorityCertificateRequest): Request[js.Object] = js.native
    def issueCertificate(params: IssueCertificateRequest): Request[IssueCertificateResponse] = js.native
    def listCertificateAuthorities(params: ListCertificateAuthoritiesRequest): Request[ListCertificateAuthoritiesResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest): Request[js.Object] = js.native
    def revokeCertificate(params: RevokeCertificateRequest): Request[js.Object] = js.native
    def tagCertificateAuthority(params: TagCertificateAuthorityRequest): Request[js.Object] = js.native
    def untagCertificateAuthority(params: UntagCertificateAuthorityRequest): Request[js.Object] = js.native
    def updateCertificateAuthority(params: UpdateCertificateAuthorityRequest): Request[js.Object] = js.native
  }

  /**
   * <p>Contains information about the certificate subject. The certificate can be one issued by your private certificate authority (CA) or it can be your private CA certificate. The <b>Subject</b> field in the certificate identifies the entity that owns or controls the public key in the certificate. The entity can be a user, computer, device, or service. The <b>Subject</b> must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be unique for each entity, but your private CA can issue more than one certificate with the same DN to the same entity. </p>
   */
  @js.native
  trait ASN1Subject extends js.Object {
    var GenerationQualifier: js.UndefOr[String3]
    var Initials: js.UndefOr[String5]
    var Title: js.UndefOr[String64]
    var Country: js.UndefOr[CountryCodeString]
    var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString]
    var CommonName: js.UndefOr[String64]
    var Pseudonym: js.UndefOr[String128]
    var GivenName: js.UndefOr[String16]
    var OrganizationalUnit: js.UndefOr[String64]
    var Locality: js.UndefOr[String128]
    var Surname: js.UndefOr[String40]
    var Organization: js.UndefOr[String64]
    var State: js.UndefOr[String128]
    var SerialNumber: js.UndefOr[String64]
  }

  object ASN1Subject {
    def apply(
      GenerationQualifier: js.UndefOr[String3] = js.undefined,
      Initials: js.UndefOr[String5] = js.undefined,
      Title: js.UndefOr[String64] = js.undefined,
      Country: js.UndefOr[CountryCodeString] = js.undefined,
      DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.undefined,
      CommonName: js.UndefOr[String64] = js.undefined,
      Pseudonym: js.UndefOr[String128] = js.undefined,
      GivenName: js.UndefOr[String16] = js.undefined,
      OrganizationalUnit: js.UndefOr[String64] = js.undefined,
      Locality: js.UndefOr[String128] = js.undefined,
      Surname: js.UndefOr[String40] = js.undefined,
      Organization: js.UndefOr[String64] = js.undefined,
      State: js.UndefOr[String128] = js.undefined,
      SerialNumber: js.UndefOr[String64] = js.undefined): ASN1Subject = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GenerationQualifier" -> GenerationQualifier.map { x => x.asInstanceOf[js.Any] },
        "Initials" -> Initials.map { x => x.asInstanceOf[js.Any] },
        "Title" -> Title.map { x => x.asInstanceOf[js.Any] },
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "DistinguishedNameQualifier" -> DistinguishedNameQualifier.map { x => x.asInstanceOf[js.Any] },
        "CommonName" -> CommonName.map { x => x.asInstanceOf[js.Any] },
        "Pseudonym" -> Pseudonym.map { x => x.asInstanceOf[js.Any] },
        "GivenName" -> GivenName.map { x => x.asInstanceOf[js.Any] },
        "OrganizationalUnit" -> OrganizationalUnit.map { x => x.asInstanceOf[js.Any] },
        "Locality" -> Locality.map { x => x.asInstanceOf[js.Any] },
        "Surname" -> Surname.map { x => x.asInstanceOf[js.Any] },
        "Organization" -> Organization.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ASN1Subject]
    }
  }

  object AuditReportResponseFormatEnum {
    val JSON = "JSON"
    val CSV = "CSV"

    val values = IndexedSeq(JSON, CSV)
  }

  object AuditReportStatusEnum {
    val CREATING = "CREATING"
    val SUCCESS = "SUCCESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, SUCCESS, FAILED)
  }

  /**
   * <p>Contains information about your private certificate authority (CA). Your private CA can issue and revoke X.509 digital certificates. Digital certificates verify that the entity named in the certificate <b>Subject</b> field owns or controls the public key contained in the <b>Subject Public Key Info</b> field. Call the <a>CreateCertificateAuthority</a> operation to create your private CA. You must then call the <a>GetCertificateAuthorityCertificate</a> operation to retrieve a private CA certificate signing request (CSR). Take the CSR to your on-premises CA and sign it with the root CA certificate or a subordinate certificate. Call the <a>ImportCertificateAuthorityCertificate</a> operation to import the signed certificate into AWS Certificate Manager (ACM). </p>
   */
  @js.native
  trait CertificateAuthority extends js.Object {
    var RestorableUntil: js.UndefOr[TStamp]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var NotBefore: js.UndefOr[TStamp]
    var LastStateChangeAt: js.UndefOr[TStamp]
    var CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration]
    var Arn: js.UndefOr[Arn]
    var NotAfter: js.UndefOr[TStamp]
    var FailureReason: js.UndefOr[FailureReason]
    var CreatedAt: js.UndefOr[TStamp]
    var Serial: js.UndefOr[String]
    var Status: js.UndefOr[CertificateAuthorityStatus]
    var Type: js.UndefOr[CertificateAuthorityType]
  }

  object CertificateAuthority {
    def apply(
      RestorableUntil: js.UndefOr[TStamp] = js.undefined,
      RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
      NotBefore: js.UndefOr[TStamp] = js.undefined,
      LastStateChangeAt: js.UndefOr[TStamp] = js.undefined,
      CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      NotAfter: js.UndefOr[TStamp] = js.undefined,
      FailureReason: js.UndefOr[FailureReason] = js.undefined,
      CreatedAt: js.UndefOr[TStamp] = js.undefined,
      Serial: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined,
      Type: js.UndefOr[CertificateAuthorityType] = js.undefined): CertificateAuthority = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RestorableUntil" -> RestorableUntil.map { x => x.asInstanceOf[js.Any] },
        "RevocationConfiguration" -> RevocationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "NotBefore" -> NotBefore.map { x => x.asInstanceOf[js.Any] },
        "LastStateChangeAt" -> LastStateChangeAt.map { x => x.asInstanceOf[js.Any] },
        "CertificateAuthorityConfiguration" -> CertificateAuthorityConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "NotAfter" -> NotAfter.map { x => x.asInstanceOf[js.Any] },
        "FailureReason" -> FailureReason.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] },
        "Serial" -> Serial.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateAuthority]
    }
  }

  /**
   * <p>Contains configuration information for your private certificate authority (CA). This includes information about the class of public key algorithm and the key pair that your private CA creates when it issues a certificate, the signature algorithm it uses used when issuing certificates, and its X.500 distinguished name. You must specify this information when you call the <a>CreateCertificateAuthority</a> operation. </p>
   */
  @js.native
  trait CertificateAuthorityConfiguration extends js.Object {
    var KeyAlgorithm: js.UndefOr[KeyAlgorithm]
    var SigningAlgorithm: js.UndefOr[SigningAlgorithm]
    var Subject: js.UndefOr[ASN1Subject]
  }

  object CertificateAuthorityConfiguration {
    def apply(
      KeyAlgorithm: js.UndefOr[KeyAlgorithm] = js.undefined,
      SigningAlgorithm: js.UndefOr[SigningAlgorithm] = js.undefined,
      Subject: js.UndefOr[ASN1Subject] = js.undefined): CertificateAuthorityConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KeyAlgorithm" -> KeyAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "SigningAlgorithm" -> SigningAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateAuthorityConfiguration]
    }
  }

  object CertificateAuthorityStatusEnum {
    val CREATING = "CREATING"
    val PENDING_CERTIFICATE = "PENDING_CERTIFICATE"
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"
    val DISABLED = "DISABLED"
    val EXPIRED = "EXPIRED"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, PENDING_CERTIFICATE, ACTIVE, DELETED, DISABLED, EXPIRED, FAILED)
  }

  object CertificateAuthorityTypeEnum {
    val SUBORDINATE = "SUBORDINATE"

    val values = IndexedSeq(SUBORDINATE)
  }

  /**
   * <p>The certificate authority certificate you are importing does not comply with conditions specified in the certificate that signed it.</p>
   */
  @js.native
  trait CertificateMismatchExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>A previous update to your private CA is still ongoing.</p>
   */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var S3BucketName: js.UndefOr[String]
    var AuditReportResponseFormat: js.UndefOr[AuditReportResponseFormat]
  }

  object CreateCertificateAuthorityAuditReportRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      AuditReportResponseFormat: js.UndefOr[AuditReportResponseFormat] = js.undefined): CreateCertificateAuthorityAuditReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "AuditReportResponseFormat" -> AuditReportResponseFormat.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateAuthorityAuditReportRequest]
    }
  }

  @js.native
  trait CreateCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportId: js.UndefOr[AuditReportId]
    var S3Key: js.UndefOr[String]
  }

  object CreateCertificateAuthorityAuditReportResponse {
    def apply(
      AuditReportId: js.UndefOr[AuditReportId] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined): CreateCertificateAuthorityAuditReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuditReportId" -> AuditReportId.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateAuthorityAuditReportResponse]
    }
  }

  @js.native
  trait CreateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var CertificateAuthorityType: js.UndefOr[CertificateAuthorityType]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
  }

  object CreateCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityConfiguration: js.UndefOr[CertificateAuthorityConfiguration] = js.undefined,
      RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
      CertificateAuthorityType: js.UndefOr[CertificateAuthorityType] = js.undefined,
      IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined): CreateCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityConfiguration" -> CertificateAuthorityConfiguration.map { x => x.asInstanceOf[js.Any] },
        "RevocationConfiguration" -> RevocationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "CertificateAuthorityType" -> CertificateAuthorityType.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateAuthorityRequest]
    }
  }

  @js.native
  trait CreateCertificateAuthorityResponse extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object CreateCertificateAuthorityResponse {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined): CreateCertificateAuthorityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCertificateAuthorityResponse]
    }
  }

  /**
   * <p>Contains configuration information for a certificate revocation list (CRL). Your private certificate authority (CA) creates base CRLs. Delta CRLs are not supported. You can enable CRLs for your new or an existing private CA by setting the <b>Enabled</b> parameter to <code>true</code>. Your private CA writes CRLs to an S3 bucket that you specify in the <b>S3BucketName</b> parameter. You can hide the name of your bucket by specifying a value for the <b>CustomCname</b> parameter. Your private CA copies the CNAME or the S3 bucket name to the <b>CRL Distribution Points</b> extension of each certificate it issues. Your S3 bucket policy must give write permission to ACM PCA. </p> <p>Your private CA uses the value in the <b>ExpirationInDays</b> parameter to calculate the <b>nextUpdate</b> field in the CRL. The CRL is refreshed at 1/2 the age of next update or when a certificate is revoked. When a certificate is revoked, it is recorded in the next CRL that is generated and in the next audit report. Only time valid certificates are listed in the CRL. Expired certificates are not included. </p> <p>CRLs contain the following fields:</p> <ul> <li> <p> <b>Version</b>: The current version number defined in RFC 5280 is V2. The integer value is 0x1. </p> </li> <li> <p> <b>Signature Algorithm</b>: The name of the algorithm used to sign the CRL.</p> </li> <li> <p> <b>Issuer</b>: The X.500 distinguished name of your private CA that issued the CRL.</p> </li> <li> <p> <b>Last Update</b>: The issue date and time of this CRL.</p> </li> <li> <p> <b>Next Update</b>: The day and time by which the next CRL will be issued.</p> </li> <li> <p> <b>Revoked Certificates</b>: List of revoked certificates. Each list item contains the following information.</p> <ul> <li> <p> <b>Serial Number</b>: The serial number, in hexadecimal format, of the revoked certificate.</p> </li> <li> <p> <b>Revocation Date</b>: Date and time the certificate was revoked.</p> </li> <li> <p> <b>CRL Entry Extensions</b>: Optional extensions for the CRL entry.</p> <ul> <li> <p> <b>X509v3 CRL Reason Code</b>: Reason the certificate was revoked.</p> </li> </ul> </li> </ul> </li> <li> <p> <b>CRL Extensions</b>: Optional extensions for the CRL.</p> <ul> <li> <p> <b>X509v3 Authority Key Identifier</b>: Identifies the public key associated with the private key used to sign the certificate.</p> </li> <li> <p> <b>X509v3 CRL Number:</b>: Decimal sequence number for the CRL.</p> </li> </ul> </li> <li> <p> <b>Signature Algorithm</b>: Algorithm used by your private CA to sign the CRL.</p> </li> <li> <p> <b>Signature Value</b>: Signature computed over the CRL.</p> </li> </ul> <p>Certificate revocation lists created by ACM PCA are DER-encoded. You can use the following OpenSSL command to list a CRL.</p> <p> <code>openssl crl -inform DER -text -in <i>crl_path</i> -noout</code> </p>
   */
  @js.native
  trait CrlConfiguration extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var ExpirationInDays: js.UndefOr[Integer1To5000]
    var CustomCname: js.UndefOr[String253]
    var S3BucketName: js.UndefOr[String3To255]
  }

  object CrlConfiguration {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined,
      ExpirationInDays: js.UndefOr[Integer1To5000] = js.undefined,
      CustomCname: js.UndefOr[String253] = js.undefined,
      S3BucketName: js.UndefOr[String3To255] = js.undefined): CrlConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "ExpirationInDays" -> ExpirationInDays.map { x => x.asInstanceOf[js.Any] },
        "CustomCname" -> CustomCname.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CrlConfiguration]
    }
  }

  @js.native
  trait DeleteCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays]
  }

  object DeleteCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      PermanentDeletionTimeInDays: js.UndefOr[PermanentDeletionTimeInDays] = js.undefined): DeleteCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "PermanentDeletionTimeInDays" -> PermanentDeletionTimeInDays.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityAuditReportRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var AuditReportId: js.UndefOr[AuditReportId]
  }

  object DescribeCertificateAuthorityAuditReportRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      AuditReportId: js.UndefOr[AuditReportId] = js.undefined): DescribeCertificateAuthorityAuditReportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "AuditReportId" -> AuditReportId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateAuthorityAuditReportRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityAuditReportResponse extends js.Object {
    var AuditReportStatus: js.UndefOr[AuditReportStatus]
    var S3BucketName: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
    var CreatedAt: js.UndefOr[TStamp]
  }

  object DescribeCertificateAuthorityAuditReportResponse {
    def apply(
      AuditReportStatus: js.UndefOr[AuditReportStatus] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined,
      CreatedAt: js.UndefOr[TStamp] = js.undefined): DescribeCertificateAuthorityAuditReportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuditReportStatus" -> AuditReportStatus.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] },
        "CreatedAt" -> CreatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateAuthorityAuditReportResponse]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object DescribeCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined): DescribeCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateAuthorityRequest]
    }
  }

  @js.native
  trait DescribeCertificateAuthorityResponse extends js.Object {
    var CertificateAuthority: js.UndefOr[CertificateAuthority]
  }

  object DescribeCertificateAuthorityResponse {
    def apply(
      CertificateAuthority: js.UndefOr[CertificateAuthority] = js.undefined): DescribeCertificateAuthorityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthority" -> CertificateAuthority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificateAuthorityResponse]
    }
  }

  object FailureReasonEnum {
    val REQUEST_TIMED_OUT = "REQUEST_TIMED_OUT"
    val UNSUPPORTED_ALGORITHM = "UNSUPPORTED_ALGORITHM"
    val OTHER = "OTHER"

    val values = IndexedSeq(REQUEST_TIMED_OUT, UNSUPPORTED_ALGORITHM, OTHER)
  }

  @js.native
  trait GetCertificateAuthorityCertificateRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object GetCertificateAuthorityCertificateRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined): GetCertificateAuthorityCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateAuthorityCertificateRequest]
    }
  }

  @js.native
  trait GetCertificateAuthorityCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  object GetCertificateAuthorityCertificateResponse {
    def apply(
      Certificate: js.UndefOr[CertificateBody] = js.undefined,
      CertificateChain: js.UndefOr[CertificateChain] = js.undefined): GetCertificateAuthorityCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateAuthorityCertificateResponse]
    }
  }

  @js.native
  trait GetCertificateAuthorityCsrRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object GetCertificateAuthorityCsrRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined): GetCertificateAuthorityCsrRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateAuthorityCsrRequest]
    }
  }

  @js.native
  trait GetCertificateAuthorityCsrResponse extends js.Object {
    var Csr: js.UndefOr[CsrBody]
  }

  object GetCertificateAuthorityCsrResponse {
    def apply(
      Csr: js.UndefOr[CsrBody] = js.undefined): GetCertificateAuthorityCsrResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Csr" -> Csr.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateAuthorityCsrResponse]
    }
  }

  @js.native
  trait GetCertificateRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CertificateArn: js.UndefOr[Arn]
  }

  object GetCertificateRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      CertificateArn: js.UndefOr[Arn] = js.undefined): GetCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateRequest]
    }
  }

  @js.native
  trait GetCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[CertificateBody]
    var CertificateChain: js.UndefOr[CertificateChain]
  }

  object GetCertificateResponse {
    def apply(
      Certificate: js.UndefOr[CertificateBody] = js.undefined,
      CertificateChain: js.UndefOr[CertificateChain] = js.undefined): GetCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCertificateResponse]
    }
  }

  @js.native
  trait ImportCertificateAuthorityCertificateRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Certificate: js.UndefOr[CertificateBodyBlob]
    var CertificateChain: js.UndefOr[CertificateChainBlob]
  }

  object ImportCertificateAuthorityCertificateRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      Certificate: js.UndefOr[CertificateBodyBlob] = js.undefined,
      CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined): ImportCertificateAuthorityCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] },
        "CertificateChain" -> CertificateChain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCertificateAuthorityCertificateRequest]
    }
  }

  /**
   * <p>One or more of the specified arguments was not valid.</p>
   */
  @js.native
  trait InvalidArgsExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The requested Amazon Resource Name (ARN) does not refer to an existing resource.</p>
   */
  @js.native
  trait InvalidArnExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The token specified in the <code>NextToken</code> argument is not valid. Use the token returned from your previous call to <a>ListCertificateAuthorities</a>.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The S3 bucket policy is not valid. The policy must give ACM PCA rights to read from and write to the bucket and find the bucket location.</p>
   */
  @js.native
  trait InvalidPolicyExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The private CA is in a state during which a report cannot be generated.</p>
   */
  @js.native
  trait InvalidStateExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The tag associated with the CA is not valid. The invalid argument is contained in the message field.</p>
   */
  @js.native
  trait InvalidTagExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait IssueCertificateRequest extends js.Object {
    var Csr: js.UndefOr[CsrBlob]
    var SigningAlgorithm: js.UndefOr[SigningAlgorithm]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Validity: js.UndefOr[Validity]
  }

  object IssueCertificateRequest {
    def apply(
      Csr: js.UndefOr[CsrBlob] = js.undefined,
      SigningAlgorithm: js.UndefOr[SigningAlgorithm] = js.undefined,
      IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      Validity: js.UndefOr[Validity] = js.undefined): IssueCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Csr" -> Csr.map { x => x.asInstanceOf[js.Any] },
        "SigningAlgorithm" -> SigningAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] },
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "Validity" -> Validity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IssueCertificateRequest]
    }
  }

  @js.native
  trait IssueCertificateResponse extends js.Object {
    var CertificateArn: js.UndefOr[Arn]
  }

  object IssueCertificateResponse {
    def apply(
      CertificateArn: js.UndefOr[Arn] = js.undefined): IssueCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IssueCertificateResponse]
    }
  }

  object KeyAlgorithmEnum {
    val RSA_2048 = "RSA_2048"
    val RSA_4096 = "RSA_4096"
    val EC_prime256v1 = "EC_prime256v1"
    val EC_secp384r1 = "EC_secp384r1"

    val values = IndexedSeq(RSA_2048, RSA_4096, EC_prime256v1, EC_secp384r1)
  }

  /**
   * <p>An ACM PCA limit has been exceeded. See the exception message returned to determine the limit that was exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait ListCertificateAuthoritiesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListCertificateAuthoritiesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListCertificateAuthoritiesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListCertificateAuthoritiesResponse extends js.Object {
    var CertificateAuthorities: js.UndefOr[CertificateAuthorities]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListCertificateAuthoritiesResponse {
    def apply(
      CertificateAuthorities: js.UndefOr[CertificateAuthorities] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListCertificateAuthoritiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorities" -> CertificateAuthorities.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCertificateAuthoritiesResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListTagsRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  /**
   * <p>The certificate signing request is invalid.</p>
   */
  @js.native
  trait MalformedCSRExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>One or more fields in the certificate are invalid.</p>
   */
  @js.native
  trait MalformedCertificateExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Your request has already been completed.</p>
   */
  @js.native
  trait RequestAlreadyProcessedExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>The request has failed for an unspecified reason.</p>
   */
  @js.native
  trait RequestFailedExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Your request is already in progress.</p>
   */
  @js.native
  trait RequestInProgressExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>A resource such as a private CA, S3 bucket, certificate, or audit report cannot be found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait RestoreCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
  }

  object RestoreCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined): RestoreCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreCertificateAuthorityRequest]
    }
  }

  /**
   * <p>Certificate revocation information used by the <a>CreateCertificateAuthority</a> and <a>UpdateCertificateAuthority</a> operations. Your private certificate authority (CA) can create and maintain a certificate revocation list (CRL). A CRL contains information about certificates revoked by your CA. For more information, see <a>RevokeCertificate</a>.</p>
   */
  @js.native
  trait RevocationConfiguration extends js.Object {
    var CrlConfiguration: js.UndefOr[CrlConfiguration]
  }

  object RevocationConfiguration {
    def apply(
      CrlConfiguration: js.UndefOr[CrlConfiguration] = js.undefined): RevocationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CrlConfiguration" -> CrlConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevocationConfiguration]
    }
  }

  object RevocationReasonEnum {
    val UNSPECIFIED = "UNSPECIFIED"
    val KEY_COMPROMISE = "KEY_COMPROMISE"
    val CERTIFICATE_AUTHORITY_COMPROMISE = "CERTIFICATE_AUTHORITY_COMPROMISE"
    val AFFILIATION_CHANGED = "AFFILIATION_CHANGED"
    val SUPERSEDED = "SUPERSEDED"
    val CESSATION_OF_OPERATION = "CESSATION_OF_OPERATION"
    val PRIVILEGE_WITHDRAWN = "PRIVILEGE_WITHDRAWN"
    val A_A_COMPROMISE = "A_A_COMPROMISE"

    val values = IndexedSeq(UNSPECIFIED, KEY_COMPROMISE, CERTIFICATE_AUTHORITY_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE)
  }

  @js.native
  trait RevokeCertificateRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var CertificateSerial: js.UndefOr[String128]
    var RevocationReason: js.UndefOr[RevocationReason]
  }

  object RevokeCertificateRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      CertificateSerial: js.UndefOr[String128] = js.undefined,
      RevocationReason: js.UndefOr[RevocationReason] = js.undefined): RevokeCertificateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "CertificateSerial" -> CertificateSerial.map { x => x.asInstanceOf[js.Any] },
        "RevocationReason" -> RevocationReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeCertificateRequest]
    }
  }

  object SigningAlgorithmEnum {
    val SHA256WITHECDSA = "SHA256WITHECDSA"
    val SHA384WITHECDSA = "SHA384WITHECDSA"
    val SHA512WITHECDSA = "SHA512WITHECDSA"
    val SHA256WITHRSA = "SHA256WITHRSA"
    val SHA384WITHRSA = "SHA384WITHRSA"
    val SHA512WITHRSA = "SHA512WITHRSA"

    val values = IndexedSeq(SHA256WITHECDSA, SHA384WITHECDSA, SHA512WITHECDSA, SHA256WITHRSA, SHA384WITHRSA, SHA512WITHRSA)
  }

  /**
   * <p>Tags are labels that you can use to identify and organize your private CAs. Each tag consists of a key and an optional value. You can associate up to 50 tags with a private CA. To add one or more tags to a private CA, call the <a>TagCertificateAuthority</a> operation. To remove a tag, call the <a>UntagCertificateAuthority</a> operation. </p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object TagCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagCertificateAuthorityRequest]
    }
  }

  /**
   * <p>You can associate up to 50 tags with a private CA. Exception information is contained in the exception message field.</p>
   */
  @js.native
  trait TooManyTagsExceptionException extends js.Object {
    val message: String
  }

  @js.native
  trait UntagCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var Tags: js.UndefOr[TagList]
  }

  object UntagCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): UntagCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagCertificateAuthorityRequest]
    }
  }

  @js.native
  trait UpdateCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[Arn]
    var RevocationConfiguration: js.UndefOr[RevocationConfiguration]
    var Status: js.UndefOr[CertificateAuthorityStatus]
  }

  object UpdateCertificateAuthorityRequest {
    def apply(
      CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined,
      RevocationConfiguration: js.UndefOr[RevocationConfiguration] = js.undefined,
      Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined): UpdateCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityArn" -> CertificateAuthorityArn.map { x => x.asInstanceOf[js.Any] },
        "RevocationConfiguration" -> RevocationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCertificateAuthorityRequest]
    }
  }

  /**
   * <p>Length of time for which the certificate issued by your private certificate authority (CA), or by the private CA itself, is valid in days, months, or years. You can issue a certificate by calling the <a>IssueCertificate</a> operation.</p>
   */
  @js.native
  trait Validity extends js.Object {
    var Value: js.UndefOr[PositiveLong]
    var Type: js.UndefOr[ValidityPeriodType]
  }

  object Validity {
    def apply(
      Value: js.UndefOr[PositiveLong] = js.undefined,
      Type: js.UndefOr[ValidityPeriodType] = js.undefined): Validity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Validity]
    }
  }

  object ValidityPeriodTypeEnum {
    val END_DATE = "END_DATE"
    val ABSOLUTE = "ABSOLUTE"
    val DAYS = "DAYS"
    val MONTHS = "MONTHS"
    val YEARS = "YEARS"

    val values = IndexedSeq(END_DATE, ABSOLUTE, DAYS, MONTHS, YEARS)
  }
}
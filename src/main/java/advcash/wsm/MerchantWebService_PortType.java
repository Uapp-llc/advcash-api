/**
 * MerchantWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public interface MerchantWebService_PortType extends java.rmi.Remote {
    public void validationSendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException;
    public advcash.wsm.SendMoneyToEcoinEUResultHolder sendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public void validationCurrencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException;
    public OutcomingTransactionDTO[] history(AuthDTO arg0, MerchantAPITransactionFilter arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException;
    public ValidateAccountResultDTO validateAccount(AuthDTO arg0, ValidateAccountRequestDTO arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, UserDoesNotExistException, WrongParamsException, DatabaseException, InternalException;
    public AccountPresentDTO[] validateAccounts(AuthDTO arg0, String[] arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException;
    public void validateCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException;
    public SendMoneyToExmoResultHolder sendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public void register(AuthDTO arg0, RegistrationRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException;
    public void validationSendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public OutcomingTransactionDTO findTransaction(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException;
    public String confirmCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, ConfirmCryptoCurrencyWithdrawalInvoiceRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceByOrderId(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException, BadParametersException;
    public String makeCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException;
    public String sendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException;
    public void validationSendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException;
    public String sendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException;
    public String transferBankCard(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException;
    public String currencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException;
    public String sendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException;
    public void validationSendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public String sendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public String transferAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException;
    public CryptoCurrencyWithdrawalInvoiceDTO createCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public void validateBankCardTransfer(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException;
    public String emailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException;
    public String makeTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, CodeIsNotValidException, DatabaseException, ExchangeCurrencyException, LimitPerDayException;
    public void validationSendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException;
    public String withdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public String sendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException;
    public void validationSendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public void validationSendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public void validateAdvcashCardTransfer(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException;
    public advcash.wsm.PaymentOrderResult findPaymentByOrderId(AuthDTO arg0, advcash.wsm.PaymentOrderRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException;
    public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceById(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException;
    public void validateWithdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
    public CancelProtectedTransferResultHolder cancelProtectedTransfer(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, TransactionFailureException, AccessDeniedException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException;
    public void createApi(AuthDTO arg0, CreateApiRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException;
    public CreateCryptoCurrencyInvoiceResult createCryptoCurrencyInvoice(AuthDTO arg0, CreateCryptoCurrencyInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException;
    public void validateEmailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException;
    public void validateTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException;
    public void validationSendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException;
    public CreateBitcoinInvoiceResult createBitcoinInvoice(AuthDTO arg0, CreateBitcoinInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException;
    public CheckCurrencyExchangeResultHolder checkCurrencyExchange(AuthDTO arg0, CheckCurrencyExchangeRequest arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, NotAuthException, MerchantDisabledException, UserBlockedException, WrongIpException, DatabaseException, WrongParamsException, BadParametersException, InternalException;
    public WalletBalanceDTO[] getBalances(AuthDTO arg0) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException;
    public SendMoneyToWexResultHolder sendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException;
}

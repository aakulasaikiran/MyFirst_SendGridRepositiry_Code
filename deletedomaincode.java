// To create Domain
	@RequestMapping(value = "/createdomain", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> createDomain(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "domain", required = true) String domain,
			@RequestParam(value = "subdomain", required = false) String subdomain,
			@RequestParam(value = "defaultdomain", required = true) boolean defaultdomain,
			@RequestParam(value = "type", required = false, defaultValue = "Email") String type,
			@RequestParam(value = "verify", required = false) Boolean verify,
			@RequestParam(value = "ips", required = false) String[] ips, @RequestBody Map<String, Object> map) {
		logger.info("Enter createDomain Method");
		try {
			CustomerDomain customerdomain = new CustomerDomain();
			customerdomain.setUsername(username);
			customerdomain.setDomain(domain);
			customerdomain.setSubdomain(subdomain);
			customerdomain.setDefaultdomain(defaultdomain);
			customerdomain.setType(type);
			customerdomain.setVerify(verify);

			String response = emailProviderService.createDomain(customerdomain, map);
			return new ResponseEntity<String>(response, HttpStatus.OK);
		} catch (InvalidDataException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(2205);
			error.setErrorMessage(environment.getProperty("2205"));

			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (NoDataFoundException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(2201);
			error.setErrorMessage(environment.getProperty("2201"));

			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (AccessDeniedException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(1707);
			error.setErrorMessage(e.getMessage());

			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(1026);
			error.setErrorMessage(environment.getProperty("1026"));

			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
	}
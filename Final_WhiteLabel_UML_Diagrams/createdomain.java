// To create SubUser
	@RequestMapping(value = "/createdomain", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> createDomain( 
	        @RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "domain", required = true) String domain,
			@RequestParam(value = "subdomain", required = false) String subdomain,
			@RequestParam(value = "defaultdomain", required = true, defaultValue = false) boolean defaultdomain,
			@RequestParam(value = "type", required = false, defaultValue = "Email") String type,
			@RequestParam(value = "verify", required = false) String verify,
			@RequestParam(value = "ips", required = false) String[] ips) {
		logger.info("Enter createDomain Method");
		try {
			String response = emailProviderService.createDomain(customerId, map);
			return new ResponseEntity<String>(response, HttpStatus.OK);
		} catch (InvalidDataException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(2205);
			error.setErrorMessage(environment.getProperty("2205"));
			logger.error(error.toString(), e);
			logger.info("Exit createSubuser Method");
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (NoDataFoundException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(2201);
			error.setErrorMessage(environment.getProperty("2201"));
			logger.error(error.toString(), e);
			logger.info("Exit createSubuser Method");
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (AccessDeniedException e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(1707);
			error.setErrorMessage(e.getMessage());
			logger.error(e.getMessage(), e);
			logger.info("Exit createSubuser Method");
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ErrorMessage error = new ErrorMessage();
			error.setCode(1026);
			error.setErrorMessage(environment.getProperty("1026"));
			logger.error(error.toString(), e);
			logger.info("Exit createSubuser Method");
			return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
	}
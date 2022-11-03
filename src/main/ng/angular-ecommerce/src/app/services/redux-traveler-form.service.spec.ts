import { TestBed } from '@angular/core/testing';

import { ReduxTravelerFormService } from './redux-traveler-form.service';

describe('ReduxTravelerFormService', () => {
  let service: ReduxTravelerFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReduxTravelerFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

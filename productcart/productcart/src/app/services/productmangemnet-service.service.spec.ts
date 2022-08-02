import { TestBed } from '@angular/core/testing';

import { ProductmangemnetServiceService } from './productmangemnet-service.service';

describe('ProductmangemnetServiceService', () => {
  let service: ProductmangemnetServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProductmangemnetServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

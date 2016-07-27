/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.3
 */
#include "fragment_0x200_monitor.h"

uint8_t fragment_sent_0x200 = (uint8_t) 0U;

uint8_t fragment_buf_0x200[80U];

bool fragment_aborting_0x200;

void callback_fragment_req_0x200(const uint8_t n_var0[80U])
{
    uint8_t n_deref0 = fragment_sent_0x200;
    
    ASSERTS((bool) (0 == n_deref0));
    for (int32_t n_ix1 = (int32_t) 0; n_ix1 <= (int32_t) 79; n_ix1++) {
        ivory_serialize_pack_uint8_be((uint8_t *) fragment_buf_0x200, (uint32_t) n_ix1, &n_var0[n_ix1]);
    }
    
    struct SMACCM_DATA__CAN_Frame_i n_local2 = {.id =(uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) 512U << (uint32_t) 18U) & (uint32_t) 536870911U) << (uint32_t) 2U) & (uint32_t) ~(uint32_t) ((uint32_t) 1U << 0)) | (uint32_t) ((uint32_t) 0 << 0)), .buf_len =(uint8_t) 8U};
    struct SMACCM_DATA__CAN_Frame_i *n_ref3 = &n_local2;
    
    for (int32_t n_ix4 = (int32_t) 0; n_ix4 <= (int32_t) 7; n_ix4++) {
        n_ref3->buf[n_ix4] = fragment_buf_0x200[n_ix4 % 80];
    }
    fragment_sent_0x200 = (uint8_t) 1U;
    callback_output_CAN_framing_write_fragment_request_2(n_ref3);
}

void callback_fragment_complete_0x200(const bool *n_var0)
{
    bool n_deref0 = *n_var0;
    
    if ((bool) !n_deref0) {
        bool n_local1 = false;
        bool *n_ref2 = &n_local1;
        
        callback_fragment_done(n_ref2);
        fragment_sent_0x200 = (uint8_t) 0U;
        fragment_aborting_0x200 = false;
    } else {
        uint8_t n_deref3 = fragment_sent_0x200;
        
        ASSERTS((bool) (n_deref3 > 0));
        
        uint16_t n_cse2 = (uint16_t) n_deref3;
        
        if ((bool) ((uint16_t) 80U <= (uint16_t) ((uint16_t) 8U * n_cse2))) {
            bool n_local4 = true;
            bool *n_ref5 = &n_local4;
            
            callback_fragment_done(n_ref5);
            fragment_sent_0x200 = (uint8_t) 0U;
            fragment_aborting_0x200 = false;
        } else {
            bool n_deref6 = fragment_aborting_0x200;
            
            if (n_deref6) {
                bool n_local7 = false;
                bool *n_ref8 = &n_local7;
                
                callback_fragment_done(n_ref8);
                fragment_sent_0x200 = (uint8_t) 0U;
                fragment_aborting_0x200 = false;
            } else {
                uint8_t n_cse26 = (uint8_t) ((uint8_t) 80U - (uint8_t) (n_deref3 * (uint8_t) 8U));
                uint8_t n_cse28 = (uint8_t) ((bool) (n_cse26 > (uint8_t) 8U) ? (uint8_t) 8U : n_cse26);
                struct SMACCM_DATA__CAN_Frame_i n_local9 = {.id =(uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) ((uint32_t) (uint16_t) ((uint16_t) (n_cse2 + (uint16_t) 512U) & (uint16_t) 2047U) << (uint32_t) 18U) & (uint32_t) 536870911U) << (uint32_t) 2U) & (uint32_t) ~(uint32_t) ((uint32_t) 1U << 0)) | (uint32_t) ((uint32_t) 0 << 0)), .buf_len =n_cse28};
                struct SMACCM_DATA__CAN_Frame_i *n_ref10 = &n_local9;
                int32_t n_cse35 = (int32_t) (uint8_t) (n_cse28 - (uint8_t) 1U) % 8;
                
                COMPILER_ASSERTS((bool) ((bool) (n_cse35 < (int32_t) 8) && (bool) ((int32_t) 0 <= n_cse35)));
                for (int32_t n_ix11 = (int32_t) 0; n_ix11 <= n_cse35; n_ix11++) {
                    n_ref10->buf[n_ix11] = fragment_buf_0x200[(int32_t) ((int32_t) ((int32_t) 8 * (int32_t) n_deref3) + n_ix11) % 80];
                }
                fragment_sent_0x200 = (uint8_t) (n_deref3 + (uint8_t) 1U);
                callback_output_CAN_framing_write_fragment_request_2(n_ref10);
            }
        }
    }
}

void callback_fragment_abort_0x200(const bool *n_var0)
{
    fragment_aborting_0x200 = true;
    
    bool n_local0 = true;
    bool *n_ref1 = &n_local0;
}

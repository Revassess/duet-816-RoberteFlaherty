select public.app_user.first_name ,public.app_user.last_name ,public.app_user."password",public.app_user.role_id, 
public.app_user.user_id,public.app_user.username 
FROM public.app_user 
INNER JOIN public.study_set ON public.app_user.user_id =public.study_set.owner_id where public.study_set.owner_id =4;